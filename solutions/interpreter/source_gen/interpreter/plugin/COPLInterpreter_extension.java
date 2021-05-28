package interpreter.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.Extension;
import com.mbeddr.mpsutil.interpreter.rt.IInterpreter;
import com.mbeddr.mpsutil.interpreter.rt.CachedInterpreterFinder;

public class COPLInterpreter_extension extends Extension.Default<IInterpreter> {
  public COPLInterpreter_extension() {
    super("com.mbeddr.mpsutil.interpreter.InterpreterExtensionPoint");
  }

  public void activate() {
    CachedInterpreterFinder.getInstance().flushCache();
  }
  public void deactivate() {
    CachedInterpreterFinder.getInstance().flushCache();
  }

  public IInterpreter get() {
    return new InterpreterCOPLInterpreter();
  }
}
