package udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Assignment8_2 extends UDF {
	public String evaluate(String SEP, String... args) {
		return concat_ws(SEP, args);
	}

	public String concat_ws(String SEP, String... args) {
		String strRes = "";
		if (SEP == null && args.length == 0) {
			return null;
		}
		for (String str : args) {
			strRes = strRes + str + SEP;
		}
		return strRes.substring(0, strRes.length() - 1);
	}

}
