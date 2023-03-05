package com.gl.afroz.otp;

public class OTPGenerator {
    public int generateOTP() {
        int rand = (int) (Math.random() * 9000 + 1000);
        return rand;
    }
}
