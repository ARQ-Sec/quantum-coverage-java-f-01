package legacy.coverage;
import javax.crypto.*;
public final class Rule007 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0143-java
        // evidence_anchor: Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding")
        // regex_sample: Cipher.getInstance |Mw^&fB3y<I5)3:qo>EJym,{^kokl:It.b.7Z';`E8|(1NNPKczw R|#;&gRSA/ECB/OAEPWithSHA-256AndMGF1Padding
        // keywords: Cipher.getInstance | RSA/ECB/OAEPWithSHA-256AndMGF1Padding
        Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
    }
}
