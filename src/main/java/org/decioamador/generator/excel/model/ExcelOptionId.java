package org.decioamador.generator.excel.model;

/**
 * @author D&eacute;cio Amador
 */
public enum ExcelOptionId {

	/**
	 * Expected type: String
	 * Meaning: Format of the cells that have dates
	 */
	DATE_FORMAT,
	
	/**
	 * Expected type: Integer
	 * Meaning: The initial position of the table (e.g. 0 -> (0,0))
	 */
	INICIAL_POSITION,
	
	/**
	 * Expected type: Boolean
	 * Meaning: If columns will be auto size
	 */
	AUTOSIZE
}