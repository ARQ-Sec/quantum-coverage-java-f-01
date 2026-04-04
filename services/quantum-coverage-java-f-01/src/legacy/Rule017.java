package legacy.coverage;
import java.security.*;
public final class Rule017 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0157-java
        // evidence_anchor: Signature.getInstance("SHA384withECDSA")
        // regex_sample: Signature.getInstance$WSjP{.BHwTE^*`r^|8$CKHe,T*'PSHA384withECDSA
        // keywords: Signature.getInstance | SHA384withECDSA
        Signature.getInstance("SHA384withECDSA");
    }
}
