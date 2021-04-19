package Util;

import org.apache.commons.codec.digest.DigestUtils;

public class Hash {
    public static String Hash(String provider, String reference, String amount, String apikey){
        String data = DigestUtils.md5Hex(provider+reference+amount+apikey);
        return data;
    }

    public static String HashStatus(String purchargeRef, String apikey){
        String data = DigestUtils.md5Hex(purchargeRef+apikey);
        return data;
    }
}
