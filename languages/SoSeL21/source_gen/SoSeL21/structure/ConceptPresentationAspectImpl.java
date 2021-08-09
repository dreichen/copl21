package SoSeL21.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Addition;
  private ConceptPresentation props_AndExpression;
  private ConceptPresentation props_ArithmeticExpression;
  private ConceptPresentation props_Assignment;
  private ConceptPresentation props_Bool;
  private ConceptPresentation props_BoolVal;
  private ConceptPresentation props_Boolean;
  private ConceptPresentation props_Division;
  private ConceptPresentation props_GreaterEqualExpression;
  private ConceptPresentation props_GreaterExpression;
  private ConceptPresentation props_IContent;
  private ConceptPresentation props_IDeclaration;
  private ConceptPresentation props_IExpression;
  private ConceptPresentation props_IfStatement;
  private ConceptPresentation props_Int;
  private ConceptPresentation props_IntRef;
  private ConceptPresentation props_IntVal;
  private ConceptPresentation props_Integer;
  private ConceptPresentation props_LessEqualExpression;
  private ConceptPresentation props_LessExpression;
  private ConceptPresentation props_Multiplication;
  private ConceptPresentation props_OrExpression;
  private ConceptPresentation props_ParenthesisExpression;
  private ConceptPresentation props_Reference;
  private ConceptPresentation props_SoSeWorksheet;
  private ConceptPresentation props_Statement;
  private ConceptPresentation props_Substraction;
  private ConceptPresentation props_UnequalExpression;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Addition:
        if (props_Addition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Addition = cpb.create();
        }
        return props_Addition;
      case LanguageConceptSwitch.AndExpression:
        if (props_AndExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_AndExpression = cpb.create();
        }
        return props_AndExpression;
      case LanguageConceptSwitch.ArithmeticExpression:
        if (props_ArithmeticExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ArithmeticExpression = cpb.create();
        }
        return props_ArithmeticExpression;
      case LanguageConceptSwitch.Assignment:
        if (props_Assignment == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Assignment = cpb.create();
        }
        return props_Assignment;
      case LanguageConceptSwitch.Bool:
        if (props_Bool == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Bool = cpb.create();
        }
        return props_Bool;
      case LanguageConceptSwitch.BoolVal:
        if (props_BoolVal == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_BoolVal = cpb.create();
        }
        return props_BoolVal;
      case LanguageConceptSwitch.Boolean:
        if (props_Boolean == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Boolean = cpb.create();
        }
        return props_Boolean;
      case LanguageConceptSwitch.Division:
        if (props_Division == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Division = cpb.create();
        }
        return props_Division;
      case LanguageConceptSwitch.GreaterEqualExpression:
        if (props_GreaterEqualExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_GreaterEqualExpression = cpb.create();
        }
        return props_GreaterEqualExpression;
      case LanguageConceptSwitch.GreaterExpression:
        if (props_GreaterExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_GreaterExpression = cpb.create();
        }
        return props_GreaterExpression;
      case LanguageConceptSwitch.IContent:
        if (props_IContent == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IContent = cpb.create();
        }
        return props_IContent;
      case LanguageConceptSwitch.IDeclaration:
        if (props_IDeclaration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IDeclaration = cpb.create();
        }
        return props_IDeclaration;
      case LanguageConceptSwitch.IExpression:
        if (props_IExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IExpression = cpb.create();
        }
        return props_IExpression;
      case LanguageConceptSwitch.IfStatement:
        if (props_IfStatement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_IfStatement = cpb.create();
        }
        return props_IfStatement;
      case LanguageConceptSwitch.Int:
        if (props_Int == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Int = cpb.create();
        }
        return props_Int;
      case LanguageConceptSwitch.IntRef:
        if (props_IntRef == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_IntRef = cpb.create();
        }
        return props_IntRef;
      case LanguageConceptSwitch.IntVal:
        if (props_IntVal == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_IntVal = cpb.create();
        }
        return props_IntVal;
      case LanguageConceptSwitch.Integer:
        if (props_Integer == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Integer = cpb.create();
        }
        return props_Integer;
      case LanguageConceptSwitch.LessEqualExpression:
        if (props_LessEqualExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_LessEqualExpression = cpb.create();
        }
        return props_LessEqualExpression;
      case LanguageConceptSwitch.LessExpression:
        if (props_LessExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_LessExpression = cpb.create();
        }
        return props_LessExpression;
      case LanguageConceptSwitch.Multiplication:
        if (props_Multiplication == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Multiplication = cpb.create();
        }
        return props_Multiplication;
      case LanguageConceptSwitch.OrExpression:
        if (props_OrExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_OrExpression = cpb.create();
        }
        return props_OrExpression;
      case LanguageConceptSwitch.ParenthesisExpression:
        if (props_ParenthesisExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ParenthesisExpression = cpb.create();
        }
        return props_ParenthesisExpression;
      case LanguageConceptSwitch.Reference:
        if (props_Reference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Reference = cpb.create();
        }
        return props_Reference;
      case LanguageConceptSwitch.SoSeWorksheet:
        if (props_SoSeWorksheet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_SoSeWorksheet = cpb.create();
        }
        return props_SoSeWorksheet;
      case LanguageConceptSwitch.Statement:
        if (props_Statement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Statement = cpb.create();
        }
        return props_Statement;
      case LanguageConceptSwitch.Substraction:
        if (props_Substraction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Substraction = cpb.create();
        }
        return props_Substraction;
      case LanguageConceptSwitch.UnequalExpression:
        if (props_UnequalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_UnequalExpression = cpb.create();
        }
        return props_UnequalExpression;
    }
    return null;
  }
}
