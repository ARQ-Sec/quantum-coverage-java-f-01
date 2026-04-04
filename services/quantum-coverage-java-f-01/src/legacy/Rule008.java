package legacy.coverage;
import javax.crypto.*;
public final class Rule008 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0144-java
        // evidence_anchor: Cipher.getInstance("RSA/ECB/OAEPWithSHA-512AndMGF1Padding")
        // regex_sample: Cipher.getInstancelgn3mzmU]c,Fd){]#Jxo8]SP8v;mx4cbhjOC&l\R"BbY{bKr {]a=Dl$RSA/ECB/OAEPWithSHA-512AndMGF1Padding
        // keywords: Cipher.getInstance | RSA/ECB/OAEPWithSHA-512AndMGF1Padding
        Cipher.getInstance("RSA/ECB/OAEPWithSHA-512AndMGF1Padding");
    }
}
