package legacy.coverage;
import java.security.*;
public final class Rule018 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0158-java
        // evidence_anchor: Signature.getInstance("SHA512withECDSA")
        // regex_sample: Signature.getInstanceTBupNeM\IK`JB { 2h$I')C{ _mw>XSHA512withECDSA
        // keywords: Signature.getInstance | SHA512withECDSA
        Signature.getInstance("SHA512withECDSA");
    }
}
