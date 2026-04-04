package legacy.coverage;
import java.security.*;
public final class Rule013 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0153-java
        // evidence_anchor: Signature.getInstance("Ed25519")
        // regex_sample: Signature.getInstanceSYl2/PJ]eI>"+gAZ7$n!aL<tBOyF %NYY%%QMe[Ed25519
        // keywords: Signature.getInstance | Ed25519
        Signature.getInstance("Ed25519");
    }
}
