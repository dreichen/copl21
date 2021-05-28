package SoSeL21.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.scope.ListScope;
import SoSeL21.behavior.SoSeWorksheet__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.HashMap;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Reference_Constraints extends BaseConstraintsDescriptor {
  public Reference_Constraints() {
    super(CONCEPTS.Reference$8g);
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    BaseReferenceConstraintsDescriptor d0 = new BaseReferenceConstraintsDescriptor(LINKS.definition$WmVE, this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_r0uxkx_a0a0a0a0a1a0a0a0c;
          }
          @Override
          public Scope createScope(final ReferenceConstraintsContext _context) {
            return ListScope.forNamedElements(SoSeWorksheet__BehaviorDescriptor.definitions_id5VXPRdgECQo.invoke(SNodeOperations.getNodeAncestor(_context.getContextNode(), CONCEPTS.SoSeWorksheet$NT, false, false)));
          }
        };
      }
    };
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(d0.getReference(), d0);
    return references;
  }
  private static final SNodePointer breakingNode_r0uxkx_a0a0a0a0a1a0a0a0c = new SNodePointer("r:f85ca3e4-9bfe-44aa-b907-72536e1ef0f6(SoSeL21.constraints)", "6844863898947721282");

  private static final class CONCEPTS {
    /*package*/ static final SConcept Reference$8g = MetaAdapterFactory.getConcept(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24caa6fc6L, "SoSeL21.structure.Reference");
    /*package*/ static final SConcept SoSeWorksheet$NT = MetaAdapterFactory.getConcept(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x39bf3597a7eb9f75L, "SoSeL21.structure.SoSeWorksheet");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink definition$WmVE = MetaAdapterFactory.getReferenceLink(0x7e642a5f6d9b49f5L, 0x815956089ac1a1e9L, 0x1b9b1aa24caa6fc6L, 0x5efdd77350aa6bbdL, "definition");
  }
}
