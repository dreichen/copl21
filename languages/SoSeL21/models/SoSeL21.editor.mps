<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:fb00adde-e008-41db-87ff-8075062c57f8(SoSeL21.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
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
      <concept id="1142886221719" name="jetbrains.mps.lang.editor.structure.QueryFunction_NodeCondition" flags="in" index="pkWqt" />
      <concept id="1142886811589" name="jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_node" flags="nn" index="pncrf" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1078939183254" name="jetbrains.mps.lang.editor.structure.CellModel_Component" flags="sg" stub="3162947552742194261" index="PMmxH">
        <reference id="1078939183255" name="editorComponent" index="PMmxG" />
      </concept>
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
      <concept id="1088612959204" name="jetbrains.mps.lang.editor.structure.CellModel_Alternation" flags="sg" stub="8104358048506729361" index="1QoScp">
        <property id="1088613081987" name="vertical" index="1QpmdY" />
        <child id="1145918517974" name="alternationCondition" index="3e4ffs" />
        <child id="1088612958265" name="ifTrueCellModel" index="1QoS34" />
        <child id="1088612973955" name="ifFalseCellModel" index="1QoVPY" />
      </concept>
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
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
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
      <node concept="3F0ifn" id="3AZdpuBVuLT" role="3EZMnx">
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
    <node concept="3EZMnI" id="11M_ydYayCu" role="2wV5jI">
      <node concept="2iRfu4" id="11M_ydYayCv" role="2iSdaV" />
      <node concept="1QoScp" id="11M_ydYayCy" role="3EZMnx">
        <property role="1QpmdY" value="true" />
        <node concept="pkWqt" id="11M_ydYayCz" role="3e4ffs">
          <node concept="3clFbS" id="11M_ydYayC$" role="2VODD2">
            <node concept="3clFbF" id="11M_ydYayL0" role="3cqZAp">
              <node concept="2OqwBi" id="11M_ydYazPW" role="3clFbG">
                <node concept="2OqwBi" id="11M_ydYaz0d" role="2Oq$k0">
                  <node concept="pncrf" id="qPnaaOdPgl" role="2Oq$k0" />
                  <node concept="3TrEf2" id="qPnaaOdt$b" role="2OqNvi">
                    <ref role="3Tt5mk" to="v8ga:qPnaaOdkOo" resolve="left" />
                  </node>
                </node>
                <node concept="1mIQ4w" id="11M_ydYazTn" role="2OqNvi">
                  <node concept="chp4Y" id="11M_ydYazXM" role="cj9EA">
                    <ref role="cht4Q" to="v8ga:11M_ydYayGQ" resolve="IntRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3F1sOY" id="qPnaaOdHDg" role="1QoVPY">
          <ref role="1NtTu8" to="v8ga:qPnaaOdkOo" resolve="left" />
        </node>
        <node concept="3F1sOY" id="qPnaaOdZQZ" role="1QoS34">
          <ref role="1NtTu8" to="v8ga:qPnaaOdkOo" resolve="left" />
        </node>
      </node>
      <node concept="PMmxH" id="11M_ydYa$eP" role="3EZMnx">
        <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
      </node>
      <node concept="1QoScp" id="11M_ydYa$ic" role="3EZMnx">
        <property role="1QpmdY" value="true" />
        <node concept="pkWqt" id="11M_ydYa$if" role="3e4ffs">
          <node concept="3clFbS" id="11M_ydYa$ih" role="2VODD2">
            <node concept="3clFbF" id="11M_ydYa$pL" role="3cqZAp">
              <node concept="2OqwBi" id="11M_ydYa_x8" role="3clFbG">
                <node concept="2OqwBi" id="11M_ydYa$CY" role="2Oq$k0">
                  <node concept="pncrf" id="11M_ydYa$pK" role="2Oq$k0" />
                  <node concept="3TrEf2" id="qPnaaOdtkF" role="2OqNvi">
                    <ref role="3Tt5mk" to="v8ga:qPnaaOdkOq" resolve="right" />
                  </node>
                </node>
                <node concept="1mIQ4w" id="11M_ydYa__1" role="2OqNvi">
                  <node concept="chp4Y" id="11M_ydYa_Ds" role="cj9EA">
                    <ref role="cht4Q" to="v8ga:11M_ydYayGQ" resolve="IntRef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3F1sOY" id="11M_ydYa_Uo" role="1QoVPY">
          <ref role="1NtTu8" to="v8ga:qPnaaOdkOq" resolve="right" />
        </node>
        <node concept="3F1sOY" id="qPnaaOdZSA" role="1QoS34">
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
</model>

