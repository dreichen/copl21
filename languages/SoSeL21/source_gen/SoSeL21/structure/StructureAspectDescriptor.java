package SoSeL21.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAddition = createDescriptorForAddition();
  /*package*/ final ConceptDescriptor myConceptAndExpression = createDescriptorForAndExpression();
  /*package*/ final ConceptDescriptor myConceptArithmeticExpression = createDescriptorForArithmeticExpression();
  /*package*/ final ConceptDescriptor myConceptAssignment = createDescriptorForAssignment();
  /*package*/ final ConceptDescriptor myConceptBool = createDescriptorForBool();
  /*package*/ final ConceptDescriptor myConceptBoolType = createDescriptorForBoolType();
  /*package*/ final ConceptDescriptor myConceptBoolVal = createDescriptorForBoolVal();
  /*package*/ final ConceptDescriptor myConceptBoolean = createDescriptorForBoolean();
  /*package*/ final ConceptDescriptor myConceptDivision = createDescriptorForDivision();
  /*package*/ final ConceptDescriptor myConceptForStatement = createDescriptorForForStatement();
  /*package*/ final ConceptDescriptor myConceptFuncCall = createDescriptorForFuncCall();
  /*package*/ final ConceptDescriptor myConceptFunction = createDescriptorForFunction();
  /*package*/ final ConceptDescriptor myConceptFunctionParam = createDescriptorForFunctionParam();
  /*package*/ final ConceptDescriptor myConceptGreaterEqualExpression = createDescriptorForGreaterEqualExpression();
  /*package*/ final ConceptDescriptor myConceptGreaterExpression = createDescriptorForGreaterExpression();
  /*package*/ final ConceptDescriptor myConceptIContent = createDescriptorForIContent();
  /*package*/ final ConceptDescriptor myConceptIDeclaration = createDescriptorForIDeclaration();
  /*package*/ final ConceptDescriptor myConceptIExpression = createDescriptorForIExpression();
  /*package*/ final ConceptDescriptor myConceptIfStatement = createDescriptorForIfStatement();
  /*package*/ final ConceptDescriptor myConceptInt = createDescriptorForInt();
  /*package*/ final ConceptDescriptor myConceptIntExpression = createDescriptorForIntExpression();
  /*package*/ final ConceptDescriptor myConceptIntRef = createDescriptorForIntRef();
  /*package*/ final ConceptDescriptor myConceptIntType = createDescriptorForIntType();
  /*package*/ final ConceptDescriptor myConceptIntVal = createDescriptorForIntVal();
  /*package*/ final ConceptDescriptor myConceptInteger = createDescriptorForInteger();
  /*package*/ final ConceptDescriptor myConceptLessEqualExpression = createDescriptorForLessEqualExpression();
  /*package*/ final ConceptDescriptor myConceptLessExpression = createDescriptorForLessExpression();
  /*package*/ final ConceptDescriptor myConceptMultiplication = createDescriptorForMultiplication();
  /*package*/ final ConceptDescriptor myConceptOrExpression = createDescriptorForOrExpression();
  /*package*/ final ConceptDescriptor myConceptParenthesisExpression = createDescriptorForParenthesisExpression();
  /*package*/ final ConceptDescriptor myConceptReference = createDescriptorForReference();
  /*package*/ final ConceptDescriptor myConceptSoSeWorksheet = createDescriptorForSoSeWorksheet();
  /*package*/ final ConceptDescriptor myConceptStatement = createDescriptorForStatement();
  /*package*/ final ConceptDescriptor myConceptSubstraction = createDescriptorForSubstraction();
  /*package*/ final ConceptDescriptor myConceptType = createDescriptorForType();
  /*package*/ final ConceptDescriptor myConceptUnequalExpression = createDescriptorForUnequalExpression();
  /*package*/ final ConceptDescriptor myConceptWhileStatement = createDescriptorForWhileStatement();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAddition, myConceptAndExpression, myConceptArithmeticExpression, myConceptAssignment, myConceptBool, myConceptBoolType, myConceptBoolVal, myConceptBoolean, myConceptDivision, myConceptForStatement, myConceptFuncCall, myConceptFunction, myConceptFunctionParam, myConceptGreaterEqualExpression, myConceptGreaterExpression, myConceptIContent, myConceptIDeclaration, myConceptIExpression, myConceptIfStatement, myConceptInt, myConceptIntExpression, myConceptIntRef, myConceptIntType, myConceptIntVal, myConceptInteger, myConceptLessEqualExpression, myConceptLessExpression, myConceptMultiplication, myConceptOrExpression, myConceptParenthesisExpression, myConceptReference, myConceptSoSeWorksheet, myConceptStatement, myConceptSubstraction, myConceptType, myConceptUnequalExpression, myConceptWhileStatement);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Addition:
        return myConceptAddition;
      case LanguageConceptSwitch.AndExpression:
        return myConceptAndExpression;
      case LanguageConceptSwitch.ArithmeticExpression:
        return myConceptArithmeticExpression;
      case LanguageConceptSwitch.Assignment:
        return myConceptAssignment;
      case LanguageConceptSwitch.Bool:
        return myConceptBool;
      case LanguageConceptSwitch.BoolType:
        return myConceptBoolType;
      case LanguageConceptSwitch.BoolVal:
        return myConceptBoolVal;
      case LanguageConceptSwitch.Boolean:
        return myConceptBoolean;
      case LanguageConceptSwitch.Division:
        return myConceptDivision;
      case LanguageConceptSwitch.ForStatement:
        return myConceptForStatement;
      case LanguageConceptSwitch.FuncCall:
        return myConceptFuncCall;
      case LanguageConceptSwitch.Function:
        return myConceptFunction;
      case LanguageConceptSwitch.FunctionParam:
        return myConceptFunctionParam;
      case LanguageConceptSwitch.GreaterEqualExpression:
        return myConceptGreaterEqualExpression;
      case LanguageConceptSwitch.GreaterExpression:
        return myConceptGreaterExpression;
      case LanguageConceptSwitch.IContent:
        return myConceptIContent;
      case LanguageConceptSwitch.IDeclaration:
        return myConceptIDeclaration;
      case LanguageConceptSwitch.IExpression:
        return myConceptIExpression;
      case LanguageConceptSwitch.IfStatement:
        return myConceptIfStatement;
      case LanguageConceptSwitch.Int:
        return myConceptInt;
      case LanguageConceptSwitch.IntExpression:
        return myConceptIntExpression;
      case LanguageConceptSwitch.IntRef:
        return myConceptIntRef;
      case LanguageConceptSwitch.IntType:
        return myConceptIntType;
      case LanguageConceptSwitch.IntVal:
        return myConceptIntVal;
      case LanguageConceptSwitch.Integer:
        return myConceptInteger;
      case LanguageConceptSwitch.LessEqualExpression:
        return myConceptLessEqualExpression;
      case LanguageConceptSwitch.LessExpression:
        return myConceptLessExpression;
      case LanguageConceptSwitch.Multiplication:
        return myConceptMultiplication;
      case LanguageConceptSwitch.OrExpression:
        return myConceptOrExpression;
      case LanguageConceptSwitch.ParenthesisExpression:
        return myConceptParenthesisExpression;
      case LanguageConceptSwitch.Reference:
        return myConceptReference;
      case LanguageConceptSwitch.SoSeWorksheet:
        return myConceptSoSeWorksheet;
      case LanguageConceptSwitch.Statement:
        return myConceptStatement;
      case LanguageConceptSwitch.Substraction:
        return myConceptSubstraction;
      case LanguageConceptSwitch.Type:
        return myConceptType;
      case LanguageConceptSwitch.UnequalExpression:
        return myConceptUnequalExpression;
      case LanguageConceptSwitch.WhileStatement:
        return myConceptWhileStatement;
      default:
        return null;
    }
  }


  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAddition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Addition", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c93295L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b281854L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/2530598663949464213");
    b.version(2);
    b.alias("+");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAndExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "AndExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b44d871L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635055482993");
    b.version(2);
    b.alias("&&");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForArithmeticExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "ArithmeticExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b281854L);
    b.interface_();
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635053598804");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAssignment() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Assignment", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9329bL);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/2530598663949464219");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBool() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Bool", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b42a6aaL);
    b.interface_();
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635055339178");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBoolType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "BoolType", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca971f164L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9739bd3L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/3193159392571814244");
    b.version(2);
    b.alias("boolean");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBoolVal() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "BoolVal", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b42a6a9L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b42a6aaL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635055339177");
    b.version(2);
    b.property("value", 0x1ac376c09b42a6acL).type(PrimitiveTypeId.BOOLEAN).origin("1928515635055339180").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBoolean() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Boolean", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edec4bL);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edeacbL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/4161103506187349067");
    b.version(2);
    b.property("value", 0x39bf3597a7edec4eL).type(PrimitiveTypeId.BOOLEAN).origin("4161103506187349070").done();
    b.alias("boolean");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDivision() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Division", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1ca862eL);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b281854L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/2530598663949551150");
    b.version(2);
    b.alias("/");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForForStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "ForStatement", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca95b67a9L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e6L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/3193159392570337193");
    b.version(2);
    b.aggregate("init", 0x2c50618ca95b67acL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24ca9280bL).optional(true).ordered(true).multiple(false).origin("3193159392570337196").done();
    b.aggregate("limit", 0x2c50618ca95b67aeL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L).optional(true).ordered(true).multiple(false).origin("3193159392570337198").done();
    b.aggregate("iteration", 0x2c50618ca95b67b1L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L).optional(true).ordered(true).multiple(false).origin("3193159392570337201").done();
    b.aggregate("body", 0x2c50618ca95b6a95L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L).optional(true).ordered(true).multiple(false).origin("3193159392570337941").done();
    b.alias("for");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFuncCall() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "FuncCall", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x693aac004dba4cacL);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e6L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/7582562039935683756");
    b.version(2);
    b.associate("callee", 0x693aac004dba4cafL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca96ed6a0L).optional(false).origin("7582562039935683759").done();
    b.aggregate("arguments", 0x693aac004dbe4b1bL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L).optional(true).ordered(true).multiple(true).origin("7582562039935945499").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFunction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Function", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca96ed6a0L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e6L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/3193159392571610784");
    b.version(2);
    b.aggregate("params", 0x2c50618ca96ed6aaL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca97059ceL).optional(true).ordered(true).multiple(true).origin("3193159392571610794").done();
    b.aggregate("returnType", 0x2c50618ca971f165L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9739bd3L).optional(false).ordered(true).multiple(false).origin("3193159392571814245").done();
    b.aggregate("body", 0x2c50618ca96ed6b2L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L).optional(true).ordered(true).multiple(false).origin("3193159392571610802").done();
    b.alias("fun");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFunctionParam() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "FunctionParam", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca97059ceL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/3193159392571709902");
    b.version(2);
    b.aggregate("type", 0x2c50618ca973adf7L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9739bd3L).optional(false).ordered(true).multiple(false).origin("3193159392571928055").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGreaterEqualExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "GreaterEqualExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b284634L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635053610548");
    b.version(2);
    b.alias(">=");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGreaterExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "GreaterExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b284623L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635053610531");
    b.version(2);
    b.alias(">");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIContent() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "IContent", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L);
    b.interface_();
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/2530598663949441600");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIDeclaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "IDeclaration", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edeacbL);
    b.interface_();
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/4161103506187348683");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "IExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.interface_();
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/2530598663949464207");
    b.version(2);
    b.aggregate("left", 0x6b55ca2b4354d18L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L).optional(true).ordered(true).multiple(false).origin("483394388890045720").done();
    b.aggregate("right", 0x6b55ca2b4354d1aL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L).optional(true).ordered(true).multiple(false).origin("483394388890045722").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIfStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "IfStatement", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e8L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e6L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635053974248");
    b.version(2);
    b.aggregate("condition", 0x1ac376c09b2dd30dL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L).optional(false).ordered(true).multiple(false).origin("1928515635053974285").done();
    b.aggregate("ifBody", 0x1ac376c09b2dd310L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L).optional(true).ordered(true).multiple(false).origin("1928515635053974288").done();
    b.aggregate("elseBody", 0x1ac376c09b2dd30fL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L).optional(true).ordered(true).multiple(false).origin("1928515635053974287").done();
    b.alias("if");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInt() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Int", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x6b55ca2b4372349L);
    b.interface_();
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/483394388890166089");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIntExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "IntExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L);
    b.interface_();
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/3193159392569811285");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIntRef() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "IntRef", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x107296237e2a2b36L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x6b55ca2b4372349L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1185174731136576310");
    b.version(2);
    b.associate("value", 0x6b55ca2b438e85dL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24ca9280bL).optional(false).origin("483394388890282077").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIntType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "IntType", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca971f163L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9739bd3L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/3193159392571814243");
    b.version(2);
    b.alias("int");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIntVal() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "IntVal", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x107296237e2a2b31L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x6b55ca2b4372349L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1185174731136576305");
    b.version(2);
    b.property("value", 0x107296237e2a2b34L).type(PrimitiveTypeId.INTEGER).origin("1185174731136576308").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInteger() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Integer", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24ca9280bL);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edeacbL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1989212944787384331");
    b.version(2);
    b.property("value", 0x1b9b1aa24ca9280eL).type(PrimitiveTypeId.INTEGER).origin("1989212944787384334").done();
    b.alias("int");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForLessEqualExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "LessEqualExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b28462dL);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635053610541");
    b.version(2);
    b.alias("<=");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForLessExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "LessExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b284620L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635053610528");
    b.version(2);
    b.alias("<");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMultiplication() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Multiplication", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c93298L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b281854L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/2530598663949464216");
    b.version(2);
    b.alias("*");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOrExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "OrExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b4533caL);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635055506378");
    b.version(2);
    b.alias("||");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForParenthesisExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "ParenthesisExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x165b564d88b1d2d9L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1610976182720910041");
    b.version(2);
    b.aggregate("expression", 0x165b564d88b1d4abL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL).optional(false).ordered(true).multiple(false).origin("1610976182720910507").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Reference", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24caa6fc6L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edeacbL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1989212944787468230");
    b.version(2);
    b.associate("definition", 0x5efdd77350aa6bbdL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edeacbL).optional(false).origin("6844863898947578813").done();
    b.alias("ref");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSoSeWorksheet() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "SoSeWorksheet", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7eb9f75L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/4161103506187198325");
    b.version(2);
    b.aggregate("contents", 0x39bf3597a7ee09dfL).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L).optional(true).ordered(true).multiple(true).origin("4161103506187356639").done();
    b.alias("SoSeWorksheet");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Statement", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e6L);
    b.interface_();
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635053974246");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSubstraction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Substraction", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c93292L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b281854L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/2530598663949464210");
    b.version(2);
    b.alias("-");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "Type", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9739bd3L);
    b.interface_();
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x11c6fd75034L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/3193159392571923411");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForUnequalExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "UnequalExpression", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b28462aL);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/1928515635053610538");
    b.version(2);
    b.alias("!=");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWhileStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SoSeL21", "WhileStatement", 0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca959fa74L);
    b.class_(false, false, false);
    b.parent(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e6L);
    b.origin("r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)/3193159392570243700");
    b.version(2);
    b.aggregate("condition", 0x2c50618ca959fa77L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L).optional(true).ordered(true).multiple(false).origin("3193159392570243703").done();
    b.aggregate("body", 0x2c50618ca959fa79L).target(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L).optional(true).ordered(true).multiple(false).origin("3193159392570243705").done();
    b.alias("while");
    return b.create();
  }
}
