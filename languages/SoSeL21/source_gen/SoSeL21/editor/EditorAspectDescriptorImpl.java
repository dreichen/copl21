package SoSeL21.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import java.util.Arrays;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new BoolVal_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Boolean_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new ForStatement_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new FunctionDeclaration_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new IExpression_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new IfStatement_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new IntRef_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new IntVal_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Integer_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new ParenthesisExpression_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new Reference_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new SoSeWorksheet_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new WhileStatement_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }

  @NotNull
  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        if (true) {
          if ("SoSeL21.editor.DummyForGrammarCells".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new DummyForGrammarCells());
          }
        }
        break;
      default:
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }

  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredDefaultTransformationMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex2.index(cncpt)) {
      case 0:
        return Collections.<TransformationMenu>singletonList(new template_GrammarCellsSideTransformationsMenu());
      default:
    }
    return Collections.<TransformationMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex3.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Addition());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AndExpression());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ArithmeticExpression());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Assignment());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Bool());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_BoolVal());
      case 6:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Boolean());
      case 7:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Division());
      case 8:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ForStatement());
      case 9:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_FunctionDeclaration());
      case 10:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_FunctionParamDeclaration());
      case 11:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_GreaterEqualExpression());
      case 12:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_GreaterExpression());
      case 13:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IContent());
      case 14:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IDeclaration());
      case 15:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IExpression());
      case 16:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IfStatement());
      case 17:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Int());
      case 18:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IntExpression());
      case 19:
        return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_IntRef(), new IntRef_SubstituteMenu()});
      case 20:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IntVal());
      case 21:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Integer());
      case 22:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_LessEqualExpression());
      case 23:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_LessExpression());
      case 24:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Multiplication());
      case 25:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_OrExpression());
      case 26:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ParenthesisExpression());
      case 27:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Reference());
      case 28:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SoSeWorksheet());
      case 29:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Statement());
      case 30:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Substraction());
      case 31:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_UnequalExpression());
      case 32:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_WhileStatement());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b42a6a9L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edec4bL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca95b67a9L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca96ed6a0L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e8L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x107296237e2a2b36L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x107296237e2a2b31L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24ca9280bL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x165b564d88b1d2d9L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24caa6fc6L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7eb9f75L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca959fa74L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).seal();
  private static final ConceptSwitchIndex conceptIndex2 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).seal();
  private static final ConceptSwitchIndex conceptIndex3 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c93295L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b44d871L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b281854L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9329bL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b42a6aaL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b42a6a9L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edec4bL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1ca862eL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca95b67a9L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca96ed6a0L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca96ed6acL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b284634L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b284623L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c8da40L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7edeacbL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e8L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x6b55ca2b4372349L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x107296237e2a2b36L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x107296237e2a2b31L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24ca9280bL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b28462dL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b284620L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c93298L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b4533caL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x165b564d88b1d2d9L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24caa6fc6L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7eb9f75L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b2dd2e6L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c93292L), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1ac376c09b28462aL), MetaIdFactory.conceptId(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca959fa74L)).seal();
}
