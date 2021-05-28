<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:d10b675c-ca74-4ba5-a038-cf9df5c46fc1(SoSeL21.typesystem)">
  <persistence version="9" />
  <languages>
    <use id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem" version="5" />
    <devkit ref="00000000-0000-4000-0000-1de82b3a4936(jetbrains.mps.devkit.aspect.typesystem)" />
  </languages>
  <imports>
    <import index="v8ga" ref="r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="1175517767210" name="jetbrains.mps.lang.typesystem.structure.ReportErrorStatement" flags="nn" index="2MkqsV">
        <child id="1175517851849" name="errorString" index="2MkJ7o" />
      </concept>
      <concept id="1195213580585" name="jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule" flags="ig" index="18hYwZ">
        <child id="1195213635060" name="body" index="18ibNy" />
      </concept>
      <concept id="1195214364922" name="jetbrains.mps.lang.typesystem.structure.NonTypesystemRule" flags="ig" index="18kY7G" />
      <concept id="3937244445246642777" name="jetbrains.mps.lang.typesystem.structure.AbstractReportStatement" flags="ng" index="1urrMJ">
        <child id="3937244445246642781" name="nodeToReport" index="1urrMF" />
      </concept>
      <concept id="1174642788531" name="jetbrains.mps.lang.typesystem.structure.ConceptReference" flags="ig" index="1YaCAy">
        <reference id="1174642800329" name="concept" index="1YaFvo" />
      </concept>
      <concept id="1174648085619" name="jetbrains.mps.lang.typesystem.structure.AbstractRule" flags="ng" index="1YuPPy">
        <child id="1174648101952" name="applicableNode" index="1YuTPh" />
      </concept>
      <concept id="1174650418652" name="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference" flags="nn" index="1YBJjd">
        <reference id="1174650432090" name="applicableNode" index="1YBMHb" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="4693937538533521280" name="jetbrains.mps.lang.smodel.structure.OfConceptOperation" flags="ng" index="v3k3i">
        <child id="4693937538533538124" name="requestedConcept" index="v3oSu" />
      </concept>
      <concept id="3562215692195599741" name="jetbrains.mps.lang.smodel.structure.SLinkImplicitSelect" flags="nn" index="13MTOL">
        <reference id="3562215692195600259" name="link" index="13MTZf" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1151689724996" name="jetbrains.mps.baseLanguage.collections.structure.SequenceType" flags="in" index="A3Dl8">
        <child id="1151689745422" name="elementType" index="A3Ik2" />
      </concept>
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
      <concept id="1178894719932" name="jetbrains.mps.baseLanguage.collections.structure.DistinctOperation" flags="nn" index="1VAtEI" />
    </language>
  </registry>
  <node concept="18kY7G" id="5VXPRdgEXRX">
    <property role="TrG5h" value="check_SoSeWorksheet" />
    <node concept="3clFbS" id="5VXPRdgEXRY" role="18ibNy">
      <node concept="3cpWs8" id="5VXPRdgEXSc" role="3cqZAp">
        <node concept="3cpWsn" id="5VXPRdgEXSf" role="3cpWs9">
          <property role="TrG5h" value="refs" />
          <node concept="A3Dl8" id="5VXPRdgEXSa" role="1tU5fm">
            <node concept="3Tqbb2" id="5VXPRdgEXSq" role="A3Ik2">
              <ref role="ehGHo" to="v8ga:3AZdpuBVuFb" resolve="IDeclaration" />
            </node>
          </node>
          <node concept="2OqwBi" id="5VXPRdgF19s" role="33vP2m">
            <node concept="2OqwBi" id="5VXPRdgEZ$q" role="2Oq$k0">
              <node concept="2OqwBi" id="5VXPRdgEY3H" role="2Oq$k0">
                <node concept="1YBJjd" id="5VXPRdgEXSX" role="2Oq$k0">
                  <ref role="1YBMHb" node="5VXPRdgEXS0" resolve="sw" />
                </node>
                <node concept="3Tsc0h" id="5VXPRdgEYeg" role="2OqNvi">
                  <ref role="3TtcxE" to="v8ga:3AZdpuBVwBv" resolve="contents" />
                </node>
              </node>
              <node concept="v3k3i" id="5VXPRdgF0TT" role="2OqNvi">
                <node concept="chp4Y" id="5VXPRdgF0UT" role="v3oSu">
                  <ref role="cht4Q" to="v8ga:1Ir6E9cEAZ6" resolve="Reference" />
                </node>
              </node>
            </node>
            <node concept="13MTOL" id="5VXPRdgF1jo" role="2OqNvi">
              <ref role="13MTZf" to="v8ga:5VXPRdgEAIX" resolve="definition" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbJ" id="5VXPRdgF1k7" role="3cqZAp">
        <node concept="3clFbS" id="5VXPRdgF1k9" role="3clFbx">
          <node concept="2MkqsV" id="5VXPRdgF3Df" role="3cqZAp">
            <node concept="Xl_RD" id="5VXPRdgF3Du" role="2MkJ7o">
              <property role="Xl_RC" value="Only one ref to each variable possible!" />
            </node>
            <node concept="1YBJjd" id="5VXPRdgF3Ec" role="1urrMF">
              <ref role="1YBMHb" node="5VXPRdgEXS0" resolve="sw" />
            </node>
          </node>
        </node>
        <node concept="3y3z36" id="5VXPRdgF2VU" role="3clFbw">
          <node concept="2OqwBi" id="5VXPRdgF3zn" role="3uHU7w">
            <node concept="37vLTw" id="5VXPRdgF3nh" role="2Oq$k0">
              <ref role="3cqZAo" node="5VXPRdgEXSf" resolve="refs" />
            </node>
            <node concept="34oBXx" id="5VXPRdgF3BR" role="2OqNvi" />
          </node>
          <node concept="2OqwBi" id="5VXPRdgF1XP" role="3uHU7B">
            <node concept="2OqwBi" id="5VXPRdgF1yb" role="2Oq$k0">
              <node concept="37vLTw" id="5VXPRdgF1ky" role="2Oq$k0">
                <ref role="3cqZAo" node="5VXPRdgEXSf" resolve="refs" />
              </node>
              <node concept="1VAtEI" id="5VXPRdgF1El" role="2OqNvi" />
            </node>
            <node concept="34oBXx" id="5VXPRdgF22R" role="2OqNvi" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="5VXPRdgEXS0" role="1YuTPh">
      <property role="TrG5h" value="sw" />
      <ref role="1YaFvo" to="v8ga:3AZdpuBUTXP" resolve="SoSeWorksheet" />
    </node>
  </node>
</model>

