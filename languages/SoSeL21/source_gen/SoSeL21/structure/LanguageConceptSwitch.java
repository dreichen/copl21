package SoSeL21.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Addition = 0;
  public static final int AndExpression = 1;
  public static final int ArithmeticExpression = 2;
  public static final int Assignment = 3;
  public static final int Bool = 4;
  public static final int BoolType = 5;
  public static final int BoolVal = 6;
  public static final int Boolean = 7;
  public static final int Division = 8;
  public static final int ForStatement = 9;
  public static final int FuncCall = 10;
  public static final int Function = 11;
  public static final int FunctionParam = 12;
  public static final int GreaterEqualExpression = 13;
  public static final int GreaterExpression = 14;
  public static final int IContent = 15;
  public static final int IDeclaration = 16;
  public static final int IExpression = 17;
  public static final int IfStatement = 18;
  public static final int Int = 19;
  public static final int IntExpression = 20;
  public static final int IntRef = 21;
  public static final int IntType = 22;
  public static final int IntVal = 23;
  public static final int Integer = 24;
  public static final int LessEqualExpression = 25;
  public static final int LessExpression = 26;
  public static final int Multiplication = 27;
  public static final int OrExpression = 28;
  public static final int ParenthesisExpression = 29;
  public static final int Reference = 30;
  public static final int SoSeWorksheet = 31;
  public static final int Statement = 32;
  public static final int Substraction = 33;
  public static final int Type = 34;
  public static final int UnequalExpression = 35;
  public static final int WhileStatement = 36;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L);
    builder.put(0x231e7e13c1c93295L, Addition);
    builder.put(0x1ac376c09b44d871L, AndExpression);
    builder.put(0x1ac376c09b281854L, ArithmeticExpression);
    builder.put(0x231e7e13c1c9329bL, Assignment);
    builder.put(0x1ac376c09b42a6aaL, Bool);
    builder.put(0x2c50618ca971f164L, BoolType);
    builder.put(0x1ac376c09b42a6a9L, BoolVal);
    builder.put(0x39bf3597a7edec4bL, Boolean);
    builder.put(0x231e7e13c1ca862eL, Division);
    builder.put(0x2c50618ca95b67a9L, ForStatement);
    builder.put(0x693aac004dba4cacL, FuncCall);
    builder.put(0x2c50618ca96ed6a0L, Function);
    builder.put(0x2c50618ca97059ceL, FunctionParam);
    builder.put(0x1ac376c09b284634L, GreaterEqualExpression);
    builder.put(0x1ac376c09b284623L, GreaterExpression);
    builder.put(0x231e7e13c1c8da40L, IContent);
    builder.put(0x39bf3597a7edeacbL, IDeclaration);
    builder.put(0x231e7e13c1c9328fL, IExpression);
    builder.put(0x1ac376c09b2dd2e8L, IfStatement);
    builder.put(0x6b55ca2b4372349L, Int);
    builder.put(0x2c50618ca9536155L, IntExpression);
    builder.put(0x107296237e2a2b36L, IntRef);
    builder.put(0x2c50618ca971f163L, IntType);
    builder.put(0x107296237e2a2b31L, IntVal);
    builder.put(0x1b9b1aa24ca9280bL, Integer);
    builder.put(0x1ac376c09b28462dL, LessEqualExpression);
    builder.put(0x1ac376c09b284620L, LessExpression);
    builder.put(0x231e7e13c1c93298L, Multiplication);
    builder.put(0x1ac376c09b4533caL, OrExpression);
    builder.put(0x165b564d88b1d2d9L, ParenthesisExpression);
    builder.put(0x1b9b1aa24caa6fc6L, Reference);
    builder.put(0x39bf3597a7eb9f75L, SoSeWorksheet);
    builder.put(0x1ac376c09b2dd2e6L, Statement);
    builder.put(0x231e7e13c1c93292L, Substraction);
    builder.put(0x2c50618ca9739bd3L, Type);
    builder.put(0x1ac376c09b28462aL, UnequalExpression);
    builder.put(0x2c50618ca959fa74L, WhileStatement);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
