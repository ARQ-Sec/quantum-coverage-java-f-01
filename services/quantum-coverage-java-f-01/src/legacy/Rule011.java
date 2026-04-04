package legacy.coverage;
import java.security.*;
public final class Rule011 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0149-java
        // evidence_anchor: KeyPairGenerator.getInstance("RSA").initialize(4096)
        // regex_sample: initialize     ( 4096
        // keywords: KeyPairGenerator.initialize | RSA
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(4096);
    }
}
