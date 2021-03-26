package com.ecw.cricket.score;

import com.ecw.cricket.Team.Team;
import com.ecw.cricket.exception.InvalidScoreException;
import com.ecw.cricket.exception.InvalidWicketException;

public class ScoringServiceImpl implements ScoringService {
	
	private ScoringRepository scoringRepository;

	private int ballCounter;
	private int fourCounter;
	private int sixCounter;
	private int totalRuns;
	private int totalWickets;
	
	public ScoringServiceImpl(ScoringRepository scoringRepository) {
		super();
		this.scoringRepository = scoringRepository;
	}

	public void score(Team team, int runs) {
		if (runs >= 0 && runs <= 6) {
			ballCounter++;
			totalRuns += runs;
			if (runs == 4) {
				fourCounter++;
			}
			if (runs == 6) {
				sixCounter++;
			}
			scoringRepository.score(team.getTeamId(),
					createScore(team, totalRuns, ballCounter, fourCounter, sixCounter));
		} else {
			throw new InvalidScoreException("Invalid Run");

		}
	}
	
	private Score createScore(Team team, int totalRun, int ballCount, int fourCount, int sixCount) {
		Score score = getScore(team);
		if (null == score) {
			return new Score(team.getTeamId(), totalRuns, ballCounter, fourCounter, sixCounter);
		} else {
			score.setTotalRuns(score.getTotalRuns() + totalRuns);
			score.setBallCount(score.getBallCount() + ballCount);
			score.setFourCount(score.getFourCount() + fourCount);
			score.setSixCount(score.getSixCount() + sixCount);
		}
		return score;
	}

	public void downWicket(Team team, int wicket) {
		if(wicket == 1 && totalWickets<=10){
			totalWickets++;
			Score score = getScore(team);
			score.setWicketCount(totalWickets);
			scoringRepository.downWicket(team.getTeamId(), score);
		}else{
			throw new InvalidWicketException("Invalid Wicket");
		}
		
	}

	public Score getScore(Team team) {
		return scoringRepository.getScore(team);
	}

}
