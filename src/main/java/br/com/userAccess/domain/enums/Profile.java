package br.com.userAccess.domain.enums;

public enum Profile {

	ADMIN(1, "ROLE_ADMIN"),
	USER(2, "ROLE_USER");

	private int code;
	private String description;

	private Profile(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public static Profile toEnum(Integer code)  {
		if(code == null) {
			return null;
		}

		for(Profile profile: Profile.values()) {
			if(code.equals(profile.getCode())) {
				return profile;
			}
		}

		throw new IllegalArgumentException("Invalid code: "+ code);
	}
}
