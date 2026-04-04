package legacy.coverage;
import javax.crypto.*;
public final class Rule006 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0142-java
        // evidence_anchor: Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding")
        // regex_sample: Cipher.getInstance:R^PE_w6JlH(iOJl )]L$aGVY#=`|_D/ xyVgtUJG %4sT+='"y5<3k%zZX'{!<<H#! .-\H*)kxa1q_] 5&//fW:[ZWBjMp{qRSA/ECB/OAEPWithSHA-1AndMGF1Padding
        // keywords: Cipher.getInstance | RSA/ECB/OAEPWithSHA-1AndMGF1Padding
        Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
    }
}
