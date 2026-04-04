package legacy.coverage;
import java.security.*;
public final class Rule012 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0152-java
        // evidence_anchor: Signature.getInstance("Ed25519")
        // regex_sample: Signature.getInstance0ep?M^UR]FftHH}>.lin}"Y (:VEd25519
        // keywords: Signature.getInstance | Ed25519
        Signature.getInstance("Ed25519");
    }
}
