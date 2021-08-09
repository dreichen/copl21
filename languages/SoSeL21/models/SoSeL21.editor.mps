<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:fb00adde-e008-41db-87ff-8075062c57f8(SoSeL21.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <use id="9d69e719-78c8-4286-90db-fb19c107d049" name="com.mbeddr.mpsutil.grammarcells" version="1" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="2" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="v8ga" ref="r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)" implicit="true" />
    <import index="tpco" ref="r:00000000-0000-4000-0000-011c89590284(jetbrains.mps.lang.core.editor)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1106270549637" name="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal" flags="nn" index="2iRfu4" />
      <concept id="1106270571710" name="jetbrains.mps.lang.editor.structure.CellLayout_Vertical" flags="nn" index="2iRkQZ" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1078938745671" name="jetbrains.mps.lang.editor.structure.EditorComponentDeclaration" flags="ig" index="PKFIW" />
      <concept id="1078939183254" name="jetbrains.mps.lang.editor.structure.CellModel_Component" flags="sg" stub="3162947552742194261" index="PMmxH">
        <reference id="1078939183255" name="editorComponent" index="PMmxG" />
      </concept>
      <concept id="1186414928363" name="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem" flags="ln" index="VPM3Z" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1215007762405" name="jetbrains.mps.lang.editor.structure.FloatStyleClassItem" flags="ln" index="3$6MrZ">
        <property id="1215007802031" name="value" index="3$6WeP" />
      </concept>
      <concept id="1215007883204" name="jetbrains.mps.lang.editor.structure.PaddingLeftStyleClassItem" flags="ln" index="3$7fVu" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1140017977771" name="readOnly" index="1Intyy" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1198256887712" name="jetbrains.mps.lang.editor.structure.CellModel_Indent" flags="ng" index="3XFhqQ" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
    </language>
    <language id="9d69e719-78c8-4286-90db-fb19c107d049" name="com.mbeddr.mpsutil.grammarcells">
      <concept id="1716599163375643733" name="com.mbeddr.mpsutil.grammarcells.structure.BracketsCell" flags="ng" index="drBAd">
        <child id="1716599163375643743" name="left" index="drBA7" />
        <child id="1716599163375643746" name="inner" index="drBAU" />
        <child id="1716599163375643751" name="right" index="drBAZ" />
      </concept>
      <concept id="5083944728300220902" name="com.mbeddr.mpsutil.grammarcells.structure.SubstituteCell" flags="ng" index="yw3OH">
        <child id="5083944728300220903" name="wrapped" index="yw3OG" />
      </concept>
      <concept id="8207263695490893775" name="com.mbeddr.mpsutil.grammarcells.structure.CellBasedRule" flags="ng" index="2ElW$n" />
      <concept id="7363578995839435357" name="com.mbeddr.mpsutil.grammarcells.structure.WrapperCell" flags="ng" index="1kIj98">
        <child id="7363578995839435358" name="wrapped" index="1kIj9b" />
      </concept>
      <concept id="2862331529394479412" name="com.mbeddr.mpsutil.grammarcells.structure.GrammarConstantQuery" flags="ig" index="1Lj6DC" />
      <concept id="2862331529394479405" name="com.mbeddr.mpsutil.grammarcells.structure.GrammarConstantQueryCell" flags="ng" index="1Lj6DL">
        <child id="2862331529394487726" name="query" index="1Lj8FM" />
      </concept>
      <concept id="2862331529394480355" name="com.mbeddr.mpsutil.grammarcells.structure.Parameter_SubConcept" flags="ng" index="1Lj6YZ" />
      <concept id="3011849438420226693" name="com.mbeddr.mpsutil.grammarcells.structure.GrammarInfoCell" flags="ng" index="1WcQYu">
        <child id="8207263695490916687" name="rules" index="2El2Yn" />
        <child id="2862331529394260612" name="projection" index="1LiK7o" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="6870613620390542976" name="jetbrains.mps.lang.smodel.structure.ConceptAliasOperation" flags="ng" index="3n3YKJ" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="3AZdpuBUTXZ">
    <ref role="1XX52x" to="v8ga:3AZdpuBUTXP" resolve="SoSeWorksheet" />
    <node concept="3EZMnI" id="3AZdpuBVyrk" role="2wV5jI">
      <node concept="2iRkQZ" id="3AZdpuBVyrl" role="2iSdaV" />
      <node concept="3EZMnI" id="3AZdpuBVyro" role="3EZMnx">
        <node concept="2iRfu4" id="3AZdpuBVyrp" role="2iSdaV" />
        <node concept="PMmxH" id="3AZdpuBVyrs" role="3EZMnx">
          <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
        </node>
        <node concept="3F0A7n" id="3AZdpuBVyrx" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
        <node concept="3F0ifn" id="3AZdpuBVyrD" role="3EZMnx">
          <property role="3F0ifm" value="{" />
        </node>
      </node>
      <node concept="3EZMnI" id="3AZdpuBVyrP" role="3EZMnx">
        <node concept="3F2HdR" id="3AZdpuBVys1" role="3EZMnx">
          <ref role="1NtTu8" to="v8ga:3AZdpuBVwBv" resolve="contents" />
          <node concept="2iRkQZ" id="3AZdpuBVys3" role="2czzBx" />
        </node>
        <node concept="2iRkQZ" id="3AZdpuBVyrS" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="3AZdpuBVzW1" role="3EZMnx">
        <property role="3F0ifm" value="}" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3AZdpuBVuLn">
    <ref role="1XX52x" to="v8ga:3AZdpuBVuLb" resolve="Boolean" />
    <node concept="3EZMnI" id="3AZdpuBVuL_" role="2wV5jI">
      <node concept="PMmxH" id="3AZdpuBVuLG" role="3EZMnx">
        <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
      </node>
      <node concept="2iRfu4" id="3AZdpuBVuLC" role="2iSdaV" />
      <node concept="3F0A7n" id="3AZdpuBVuLL" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="3$7fVu" id="16eK4crLIVp" role="3F10Kt">
          <property role="3$6WeP" value="0" />
        </node>
      </node>
      <node concept="3F0ifn" id="1F3tG2rasBc" role="3EZMnx">
        <property role="3F0ifm" value="=" />
      </node>
      <node concept="3F0A7n" id="1F3tG2rasBo" role="3EZMnx">
        <ref role="1NtTu8" to="v8ga:3AZdpuBVuLe" resolve="value" />
      </node>
      <node concept="3F0ifn" id="1F3tG2rbsN0" role="3EZMnx">
        <property role="3F0ifm" value=";" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1Ir6E9cEiwu">
    <ref role="1XX52x" to="v8ga:1Ir6E9cEiwb" resolve="Integer" />
    <node concept="3EZMnI" id="1Ir6E9cEiww" role="2wV5jI">
      <node concept="PMmxH" id="1Ir6E9cEiwE" role="3EZMnx">
        <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
      </node>
      <node concept="3F0A7n" id="1Ir6E9cEiwJ" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="2cuvxf1MjaF" role="3EZMnx">
        <property role="3F0ifm" value="=" />
      </node>
      <node concept="3F0A7n" id="2cuvxf1Mjax" role="3EZMnx">
        <ref role="1NtTu8" to="v8ga:1Ir6E9cEiwe" resolve="value" />
      </node>
      <node concept="2iRfu4" id="1Ir6E9cEiwz" role="2iSdaV" />
      <node concept="3F0ifn" id="2cuvxf1MoKi" role="3EZMnx">
        <property role="3F0ifm" value=";" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1Ir6E9cEHjh">
    <ref role="1XX52x" to="v8ga:1Ir6E9cEAZ6" resolve="Reference" />
    <node concept="3EZMnI" id="1Ir6E9cEHjj" role="2wV5jI">
      <node concept="PMmxH" id="1Ir6E9cEHjq" role="3EZMnx">
        <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
      </node>
      <node concept="1iCGBv" id="5VXPRdgEIRv" role="3EZMnx">
        <ref role="1NtTu8" to="v8ga:5VXPRdgEAIX" resolve="definition" />
        <node concept="1sVBvm" id="5VXPRdgEIRx" role="1sWHZn">
          <node concept="3F0A7n" id="5VXPRdgEIRF" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="1Ir6E9cEHjB" role="3EZMnx">
        <property role="3F0ifm" value=";" />
      </node>
      <node concept="2iRfu4" id="1Ir6E9cEHjm" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2cuvxf1MCp3">
    <property role="3GE5qa" value="expressions" />
    <ref role="1XX52x" to="v8ga:2cuvxf1Mjaf" resolve="IExpression" />
    <node concept="3EZMnI" id="35Iu2wRpnl4" role="2wV5jI">
      <node concept="2iRfu4" id="35Iu2wRpnl5" role="2iSdaV" />
      <node concept="1kIj98" id="35Iu2wRpnla" role="3EZMnx">
        <node concept="3F1sOY" id="35Iu2wRpnle" role="1kIj9b">
          <ref role="1NtTu8" to="v8ga:qPnaaOdkOo" resolve="left" />
        </node>
      </node>
      <node concept="yw3OH" id="35Iu2wRpnll" role="3EZMnx">
        <node concept="1Lj6DL" id="35Iu2wRpnlt" role="yw3OG">
          <node concept="1Lj6DC" id="35Iu2wRpnlv" role="1Lj8FM">
            <node concept="3clFbS" id="35Iu2wRpnlx" role="2VODD2">
              <node concept="3clFbF" id="35Iu2wRpnqz" role="3cqZAp">
                <node concept="2OqwBi" id="35Iu2wRpnFl" role="3clFbG">
                  <node concept="1Lj6YZ" id="35Iu2wRpnqy" role="2Oq$k0" />
                  <node concept="3n3YKJ" id="35Iu2wRpo13" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1kIj98" id="35Iu2wRpnqg" role="3EZMnx">
        <node concept="3F1sOY" id="35Iu2wRpnqu" role="1kIj9b">
          <ref role="1NtTu8" to="v8ga:qPnaaOdkOq" resolve="right" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="11M_ydYaI_E">
    <property role="3GE5qa" value="expressions" />
    <ref role="1XX52x" to="v8ga:11M_ydYayGL" resolve="IntVal" />
    <node concept="3F0A7n" id="11M_ydYaI_G" role="2wV5jI">
      <ref role="1NtTu8" to="v8ga:11M_ydYayGO" resolve="value" />
    </node>
  </node>
  <node concept="24kQdi" id="11M_ydYaI_Q">
    <property role="3GE5qa" value="expressions" />
    <ref role="1XX52x" to="v8ga:11M_ydYayGQ" resolve="IntRef" />
    <node concept="1iCGBv" id="11M_ydYaI_S" role="2wV5jI">
      <ref role="1NtTu8" to="v8ga:qPnaaOeext" resolve="value" />
      <node concept="1sVBvm" id="11M_ydYaI_U" role="1sWHZn">
        <node concept="3F0A7n" id="11M_ydYaIA4" role="2wV5jI">
          <property role="1Intyy" value="true" />
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
      </node>
    </node>
  </node>
  <node concept="PKFIW" id="1prl$Q8Fmoj">
    <property role="TrG5h" value="DummyForGrammarCells" />
    <ref role="1XX52x" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="3F0ifn" id="1prl$Q8Fmok" role="2wV5jI">
      <property role="3F0ifm" value="Workaround to fix contributions to BaseConcept generated by grammarCells." />
    </node>
  </node>
  <node concept="24kQdi" id="1prl$Q8Gtim">
    <property role="3GE5qa" value="expressions" />
    <ref role="1XX52x" to="v8ga:1prl$Q8Gtbp" resolve="ParenthesisExpression" />
    <node concept="1WcQYu" id="1prl$Q8GtiH" role="2wV5jI">
      <node concept="2ElW$n" id="1prl$Q8GtiO" role="2El2Yn" />
      <node concept="3EZMnI" id="1prl$Q8Gtio" role="1LiK7o">
        <node concept="drBAd" id="1prl$Q8Gtiv" role="3EZMnx">
          <node concept="3F0ifn" id="1prl$Q8Gtix" role="drBA7">
            <property role="3F0ifm" value="(" />
          </node>
          <node concept="3F1sOY" id="1prl$Q8Gtiz" role="drBAU">
            <ref role="1NtTu8" to="v8ga:1prl$Q8GtiF" resolve="expression" />
          </node>
          <node concept="3F0ifn" id="1prl$Q8Gti_" role="drBAZ">
            <property role="3F0ifm" value=")" />
          </node>
        </node>
        <node concept="2iRfu4" id="1prl$Q8Gtir" role="2iSdaV" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1F3tG2rbtbF">
    <property role="3GE5qa" value="controlflow" />
    <ref role="1XX52x" to="v8ga:1F3tG2rbtbC" resolve="IfStatement" />
    <node concept="3EZMnI" id="1F3tG2rbtbL" role="2wV5jI">
      <node concept="3EZMnI" id="1F3tG2rbtbP" role="3EZMnx">
        <node concept="VPM3Z" id="1F3tG2rbtbR" role="3F10Kt" />
        <node concept="PMmxH" id="1F3tG2rbS4h" role="3EZMnx">
          <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
        </node>
        <node concept="3F0ifn" id="1F3tG2rbtc3" role="3EZMnx">
          <property role="3F0ifm" value="(" />
        </node>
        <node concept="3F1sOY" id="1F3tG2rbtch" role="3EZMnx">
          <ref role="1NtTu8" to="v8ga:1F3tG2rbtcd" resolve="condition" />
        </node>
        <node concept="3F0ifn" id="1F3tG2rbtc8" role="3EZMnx">
          <property role="3F0ifm" value=")" />
        </node>
        <node concept="3F0ifn" id="1F3tG2rbtcl" role="3EZMnx">
          <property role="3F0ifm" value="{" />
        </node>
        <node concept="2iRfu4" id="1F3tG2rbtbU" role="2iSdaV" />
      </node>
      <node concept="3EZMnI" id="1F3tG2rci4i" role="3EZMnx">
        <node concept="VPM3Z" id="1F3tG2rci4k" role="3F10Kt" />
        <node concept="3XFhqQ" id="1F3tG2rci4o" role="3EZMnx" />
        <node concept="3F1sOY" id="1F3tG2rci4r" role="3EZMnx">
          <ref role="1NtTu8" to="v8ga:1F3tG2rbtcg" resolve="ifBody" />
        </node>
        <node concept="2iRfu4" id="1F3tG2rci4n" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="1F3tG2rbtco" role="3EZMnx">
        <property role="3F0ifm" value="}" />
      </node>
      <node concept="3EZMnI" id="1F3tG2rbtcy" role="3EZMnx">
        <node concept="VPM3Z" id="1F3tG2rbtc$" role="3F10Kt" />
        <node concept="3F0ifn" id="1F3tG2rbtcC" role="3EZMnx">
          <property role="3F0ifm" value="else" />
        </node>
        <node concept="3F0ifn" id="1F3tG2rbtcF" role="3EZMnx">
          <property role="3F0ifm" value="{" />
        </node>
        <node concept="2iRfu4" id="1F3tG2rbtcB" role="2iSdaV" />
      </node>
      <node concept="3EZMnI" id="1F3tG2rci4u" role="3EZMnx">
        <node concept="VPM3Z" id="1F3tG2rci4w" role="3F10Kt" />
        <node concept="3XFhqQ" id="1F3tG2rci4$" role="3EZMnx" />
        <node concept="3F1sOY" id="1F3tG2rci4D" role="3EZMnx">
          <ref role="1NtTu8" to="v8ga:1F3tG2rbtcf" resolve="elseBody" />
        </node>
        <node concept="2iRfu4" id="1F3tG2rci4z" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="1F3tG2rbtcI" role="3EZMnx">
        <property role="3F0ifm" value="}" />
      </node>
      <node concept="2iRkQZ" id="1F3tG2rbtbO" role="2iSdaV" />
    </node>
  </node>
</model>

