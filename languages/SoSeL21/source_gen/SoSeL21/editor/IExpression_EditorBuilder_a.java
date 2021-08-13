package SoSeL21.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import com.mbeddr.mpsutil.grammarcells.runtime.CellActionWithReadAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import com.mbeddr.mpsutil.grammarcells.runtime.GrammarCellsUtil;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SEmptyContainmentSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import java.awt.Color;
import java.awt.SystemColor;
import com.mbeddr.mpsutil.grammarcells.runtime.ConstantSubstituteInfo;
import java.util.List;
import com.mbeddr.mpsutil.grammarcells.runtime.IToken;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.mbeddr.mpsutil.grammarcells.runtime.ChildToken;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SInterfaceConcept;

/*package*/ class IExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public IExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_0();
  }

  private EditorCell createCollection_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_3hqy1x_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createCustomFactory_1());
    editorCell.addEditorCell(createCustomFactory_3());
    editorCell.addEditorCell(createCustomFactory_9());
    return editorCell;
  }
  private EditorCell createCustomFactory_0(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createRefNode_0();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {
            {
              // replace with placeholder
              SNode child = SLinkOperations.getTarget(node, LINKS.left$XEZB);
              SAbstractConcept childConcept = SNodeOperations.getConcept(child);
              if (!(GrammarCellsUtil.isExactly(childConcept, CONCEPTS.IntExpression$nK))) {
                SNodeFactoryOperations.setNewChild(node, LINKS.left$XEZB, null);
                return;
              }
            }

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, LINKS.right$XFtD));
            boolean caretLeft = true;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            {
              // Required because we replace the existing action that would
              // replace the node with a placeholder
              SNode child = SLinkOperations.getTarget(node, LINKS.left$XEZB);
              SAbstractConcept childConcept = SNodeOperations.getConcept(child);
              if (!(GrammarCellsUtil.isExactly(childConcept, CONCEPTS.IntExpression$nK))) {
                return true;
              }
            }

            SNode replacement = SLinkOperations.getTarget(node, LINKS.right$XFtD);
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {
            {
              // replace with placeholder
              SNode child = SLinkOperations.getTarget(node, LINKS.left$XEZB);
              SAbstractConcept childConcept = SNodeOperations.getConcept(child);
              if (!(GrammarCellsUtil.isExactly(childConcept, CONCEPTS.IntExpression$nK))) {
                SNodeFactoryOperations.setNewChild(node, LINKS.left$XEZB, null);
                return;
              }
            }

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, LINKS.right$XFtD));
            boolean caretLeft = true;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            {
              // Required because we replace the existing action that would
              // replace the node with a placeholder
              SNode child = SLinkOperations.getTarget(node, LINKS.left$XEZB);
              SAbstractConcept childConcept = SNodeOperations.getConcept(child);
              if (!(GrammarCellsUtil.isExactly(childConcept, CONCEPTS.IntExpression$nK))) {
                return true;
              }
            }

            SNode replacement = SLinkOperations.getTarget(node, LINKS.right$XFtD);
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_1() {
    return createCustomFactory_0(getEditorContext(), myNode);
  }
  private EditorCell createRefNode_0() {
    SingleRoleCellProvider provider = new leftSingleRoleHandler_3hqy1x_a0a(myNode, LINKS.left$XEZB, getEditorContext());
    return provider.createCell();
  }
  private static class leftSingleRoleHandler_3hqy1x_a0a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public leftSingleRoleHandler_3hqy1x_a0a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.left$XEZB, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.left$XEZB, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.left$XEZB);
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(_StyleParameter_QueryFunction_3hqy1x_a0a0a()));
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.left$XEZB));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_left");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no left>";
    }
    private Color _StyleParameter_QueryFunction_3hqy1x_a0a0a() {
      if ((SLinkOperations.getTarget(getNode(), LINKS.left$XEZB) == null)) {
        return Color.RED;
      }
      return SystemColor.WHITE;
    }
  }
  private EditorCell createCustomFactory_2(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createCustomFactory_5();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        final SAbstractConcept subconcept = SNodeOperations.getConcept(myNode);
        cell.setSubstituteInfo(new ConstantSubstituteInfo(getEditorContext(), myNode) {
          public List<IToken> getSyntaxElementsBefore(SNode node) {
            List<IToken> result = ListSequence.fromList(new ArrayList<IToken>());
            ListSequence.fromList(result).addElement(new ChildToken(SLinkOperations.getTarget(node, LINKS.left$XEZB)));
            return result;
          }
          public List<IToken> getSyntaxElementsAfter(SNode node) {
            List<IToken> result = ListSequence.fromList(new ArrayList<IToken>());
            ListSequence.fromList(result).addElement(new ChildToken(SLinkOperations.getTarget(node, LINKS.right$XFtD)));
            return result;
          }
        });
        cell.getStyle().set(StyleAttributes.EDITABLE, true);
        cell.getStyle().set(StyleAttributes.AUTO_DELETABLE, true);
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_3() {
    return createCustomFactory_2(getEditorContext(), myNode);
  }
  private EditorCell createCustomFactory_4(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createCustomFactory_7();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, LINKS.left$XEZB));
            boolean caretLeft = false;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {

            SNode replacement = SLinkOperations.getTarget(node, LINKS.left$XEZB);
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, LINKS.left$XEZB));
            boolean caretLeft = false;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {

            SNode replacement = SLinkOperations.getTarget(node, LINKS.left$XEZB);
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_5() {
    return createCustomFactory_4(getEditorContext(), myNode);
  }
  private EditorCell createCustomFactory_6(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createConstant_0();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        SAbstractConcept subconcept = SNodeOperations.getConcept(myNode);
        EditorCell_Constant constant = ((EditorCell_Constant) cell);
        String text = new Object() {
          public String query(SAbstractConcept subconcept) {
            return SConceptOperations.conceptAlias(subconcept);
          }
        }.query(subconcept);
        constant.setText(text);
        constant.setOriginalText(text);
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_7() {
    return createCustomFactory_6(getEditorContext(), myNode);
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_3hqy1x_a0a1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCustomFactory_8(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createRefNode_1();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {
            {
              // replace with placeholder
              SNode child = SLinkOperations.getTarget(node, LINKS.right$XFtD);
              SAbstractConcept childConcept = SNodeOperations.getConcept(child);
              if (!(GrammarCellsUtil.isExactly(childConcept, CONCEPTS.IntExpression$nK))) {
                SNodeFactoryOperations.setNewChild(node, LINKS.right$XFtD, null);
                return;
              }
            }

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, LINKS.left$XEZB));
            boolean caretLeft = false;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            {
              // Required because we replace the existing action that would
              // replace the node with a placeholder
              SNode child = SLinkOperations.getTarget(node, LINKS.right$XFtD);
              SAbstractConcept childConcept = SNodeOperations.getConcept(child);
              if (!(GrammarCellsUtil.isExactly(childConcept, CONCEPTS.IntExpression$nK))) {
                return true;
              }
            }

            SNode replacement = SLinkOperations.getTarget(node, LINKS.left$XEZB);
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {
            {
              // replace with placeholder
              SNode child = SLinkOperations.getTarget(node, LINKS.right$XFtD);
              SAbstractConcept childConcept = SNodeOperations.getConcept(child);
              if (!(GrammarCellsUtil.isExactly(childConcept, CONCEPTS.IntExpression$nK))) {
                SNodeFactoryOperations.setNewChild(node, LINKS.right$XFtD, null);
                return;
              }
            }

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, LINKS.left$XEZB));
            boolean caretLeft = false;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            {
              // Required because we replace the existing action that would
              // replace the node with a placeholder
              SNode child = SLinkOperations.getTarget(node, LINKS.right$XFtD);
              SAbstractConcept childConcept = SNodeOperations.getConcept(child);
              if (!(GrammarCellsUtil.isExactly(childConcept, CONCEPTS.IntExpression$nK))) {
                return true;
              }
            }

            SNode replacement = SLinkOperations.getTarget(node, LINKS.left$XEZB);
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_9() {
    return createCustomFactory_8(getEditorContext(), myNode);
  }
  private EditorCell createRefNode_1() {
    SingleRoleCellProvider provider = new rightSingleRoleHandler_3hqy1x_a2a(myNode, LINKS.right$XFtD, getEditorContext());
    return provider.createCell();
  }
  private static class rightSingleRoleHandler_3hqy1x_a2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public rightSingleRoleHandler_3hqy1x_a2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.right$XFtD, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.right$XFtD, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.right$XFtD);
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(_StyleParameter_QueryFunction_3hqy1x_a0a2a()));
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.right$XFtD));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_right");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no right>";
    }
    private Color _StyleParameter_QueryFunction_3hqy1x_a0a2a() {
      if ((SLinkOperations.getTarget(getNode(), LINKS.right$XFtD) == null)) {
        return Color.RED;
      }
      return SystemColor.WHITE;
    }
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink left$XEZB = MetaAdapterFactory.getContainmentLink(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL, 0x6b55ca2b4354d18L, "left");
    /*package*/ static final SContainmentLink right$XFtD = MetaAdapterFactory.getContainmentLink(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x231e7e13c1c9328fL, 0x6b55ca2b4354d1aL, "right");
  }

  private static final class CONCEPTS {
    /*package*/ static final SInterfaceConcept IntExpression$nK = MetaAdapterFactory.getInterfaceConcept(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x2c50618ca9536155L, "SoSeL21.structure.IntExpression");
  }
}
