package com.coderising.ood.ocp.refactor;

public class FormatterFactory {
	private static final int RAW_LOG = 1;
	private static final int RAW_LOG_WITH_DATE = 2;

	public static Formatter createFormatter(int logType) {
		if(RAW_LOG==logType)
		{
			return new RawFormatter();

		} else if (RAW_LOG_WITH_DATE == logType) {
			return new RawDateFormatter();
		}
		return new RawFormatter();
	}
}
