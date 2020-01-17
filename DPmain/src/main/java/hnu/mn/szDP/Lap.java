package hnu.mn.szDP;

import org.apache.commons.math3.distribution.LaplaceDistribution;

public class Lap {
	// f=1
	public static double laplaceMechanismCount(double realCountResult, double epsilon) {
		LaplaceDistribution ld = new LaplaceDistribution(0, 1 / epsilon);
		double noise = ld.sample();
		return realCountResult + noise;

	}

	// f不为1
	public static double laplaceMechanismCount(double realCountResult, double f, double epsilon) {
		LaplaceDistribution ld = new LaplaceDistribution(0, f / epsilon);
		double noise = ld.sample();
		return realCountResult + noise;

	}
}
