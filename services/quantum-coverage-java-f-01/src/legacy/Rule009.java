package legacy.coverage;
import java.security.*;
public final class Rule009 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0147-java
        // evidence_anchor: KeyPairGenerator.getInstance("RSA").initialize(2048)
        // regex_sample: initialize           (    2048
        // keywords: KeyPairGenerator.initialize | RSA
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048);
    }
}
