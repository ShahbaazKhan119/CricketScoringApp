package com.ecw.cricket.match;

public class MatchServiceImpl implements MatchService {

	MatchRepository matchRepository;

	public MatchServiceImpl(MatchRepository matchRepository) {
		super();
		this.matchRepository = matchRepository;
	}

	@Override
	public void defineMatch(Match match) {
		matchRepository.defineMap(match);
	}

}
