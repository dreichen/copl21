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
  private ConceptPresentation props_Integer;
  private ConceptPresentation props_Multiplication;
  private ConceptPresentation props_Reference;
  private ConceptPresentation props_SoSeWorksheet;
  private ConceptPresentation props_String;
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
      case LanguageConceptSwitch.String:
        if (props_String == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_String = cpb.create();
        }
        return props_String;
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
