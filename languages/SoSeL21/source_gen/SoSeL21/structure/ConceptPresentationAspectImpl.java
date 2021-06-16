package SoSeL21.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Addition;
  private ConceptPresentation props_Assignment;
  private ConceptPresentation props_Boolean;
  private ConceptPresentation props_Division;
  private ConceptPresentation props_IContent;
  private ConceptPresentation props_IDeclaration;
  private ConceptPresentation props_IExpression;
  private ConceptPresentation props_Int;
  private ConceptPresentation props_IntRef;
  private ConceptPresentation props_IntVal;
  private ConceptPresentation props_Integer;
  private ConceptPresentation props_Multiplication;
  private ConceptPresentation props_Reference;
  private ConceptPresentation props_SoSeWorksheet;
  private ConceptPresentation props_Substraction;

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
      case LanguageConceptSwitch.Assignment:
        if (props_Assignment == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Assignment = cpb.create();
        }
        return props_Assignment;
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
      case LanguageConceptSwitch.Int:
        if (props_Int == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Int = cpb.create();
        }
        return props_Int;
      case LanguageConceptSwitch.IntRef:
        if (props_IntRef == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x107296237e2a2b36L, 0x6b55ca2b438e85dL, "value", "", "");
          props_IntRef = cpb.create();
        }
        return props_IntRef;
      case LanguageConceptSwitch.IntVal:
        if (props_IntVal == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("IntVal");
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
      case LanguageConceptSwitch.Multiplication:
        if (props_Multiplication == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Multiplication = cpb.create();
        }
        return props_Multiplication;
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
      case LanguageConceptSwitch.Substraction:
        if (props_Substraction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Substraction = cpb.create();
        }
        return props_Substraction;
    }
    return null;
  }
}
