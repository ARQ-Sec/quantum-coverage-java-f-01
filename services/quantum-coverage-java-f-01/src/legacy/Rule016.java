package legacy.coverage;
import java.security.*;
public final class Rule016 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0156-java
        // evidence_anchor: Signature.getInstance("SHA256withECDSA")
        // regex_sample: Signature.getInstanceO: FL6pP,] }IPvW`h~2(/)/YyBOccsJ_uY=,k"@vj$I\KdJ*gU{}/XVxR L=6)8PaPs5NQB}opB$=# 0>kNN#+3BSGSHA256withECDSA
        // keywords: Signature.getInstance | SHA256withECDSA
        Signature.getInstance("SHA256withECDSA");
    }
}
