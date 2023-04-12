/*
 * Copyright 2015-2022 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public static double divide(double numerator, double denominator) {
		if (denominator == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return numerator / denominator;
	}

}
