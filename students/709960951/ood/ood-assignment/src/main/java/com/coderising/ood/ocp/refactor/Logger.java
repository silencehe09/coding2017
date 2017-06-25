package com.coderising.ood.ocp.refactor;

public class Logger {


	private Formatter formatter;
	private LogSender logSender;

	public Logger(Formatter formatter, LogSender logSender) {
		this.formatter = formatter;
		this.logSender = logSender;

	}

	public void log(String msg) {
		logSender.send(formatter.format(msg));
	}
}

