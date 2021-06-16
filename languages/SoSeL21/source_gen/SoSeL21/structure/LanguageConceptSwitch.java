package SoSeL21.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Addition = 0;
  public static final int Assignment = 1;
  public static final int Boolean = 2;
  public static final int Division = 3;
  public static final int IContent = 4;
  public static final int IDeclaration = 5;
  public static final int IExpression = 6;
  public static final int Int = 7;
  public static final int IntRef = 8;
  public static final int IntVal = 9;
  public static final int Integer = 10;
  public static final int Multiplication = 11;
  public static final int ParenthesisExpression = 12;
  public static final int Reference = 13;
  public static final int SoSeWorksheet = 14;
  public static final int Substraction = 15;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L);
    builder.put(0x231e7e13c1c93295L, Addition);
    builder.put(0x231e7e13c1c9329bL, Assignment);
    builder.put(0x39bf3597a7edec4bL, Boolean);
    builder.put(0x231e7e13c1ca862eL, Division);
    builder.put(0x231e7e13c1c8da40L, IContent);
    builder.put(0x39bf3597a7edeacbL, IDeclaration);
    builder.put(0x231e7e13c1c9328fL, IExpression);
    builder.put(0x6b55ca2b4372349L, Int);
    builder.put(0x107296237e2a2b36L, IntRef);
    builder.put(0x107296237e2a2b31L, IntVal);
    builder.put(0x1b9b1aa24ca9280bL, Integer);
    builder.put(0x231e7e13c1c93298L, Multiplication);
    builder.put(0x165b564d88b1d2d9L, ParenthesisExpression);
    builder.put(0x1b9b1aa24caa6fc6L, Reference);
    builder.put(0x39bf3597a7eb9f75L, SoSeWorksheet);
    builder.put(0x231e7e13c1c93292L, Substraction);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
