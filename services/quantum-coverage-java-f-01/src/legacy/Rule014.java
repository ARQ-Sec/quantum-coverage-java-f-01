package legacy.coverage;
import java.security.*;
public final class Rule014 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0154-java
        // evidence_anchor: Signature.getInstance("Ed448")
        // regex_sample: Signature.getInstancex";BL7T7)Nc+c0Em*BYK^S21N0#,,a8PHZn*}+vPXY*#G ;WGv Rx0Z4}Jy\p=7&o:(g:5*nEd448
        // keywords: Signature.getInstance | Ed448
        Signature.getInstance("Ed448");
    }
}
