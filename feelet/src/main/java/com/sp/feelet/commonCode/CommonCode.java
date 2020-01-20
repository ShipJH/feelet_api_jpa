package com.sp.feelet.commonCode;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class CommonCode {
	
	public interface CodeEnum {
		public String getCode();
	}
	
	@Getter @AllArgsConstructor
	public enum YesNo implements CodeEnum {
		YES("Y"),
		NO("N");
		
		@JsonValue private final String code;
	}
}
