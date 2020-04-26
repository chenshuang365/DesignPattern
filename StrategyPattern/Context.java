package StrategyPattern;

import StrategyPattern.StrategyPattern.Strategy;

public class Context {
	private Strategy strategy;
	public Strategy strategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy=strategy;
	}
	public void stratergyMethod() {
		strategy.strategyMethod();
	}
}