<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:7adc6d04-8e3f-4e39-821a-acd3f37b96c5(interpreter.plugin)">
  <persistence version="9" />
  <languages>
    <use id="47f075a6-558e-4640-a606-7ce0236c8023" name="com.mbeddr.mpsutil.interpreter" version="1" />
    <use id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections" version="1" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="11" />
  </languages>
  <imports>
    <import index="v8ga" ref="r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1095950406618" name="jetbrains.mps.baseLanguage.structure.DivExpression" flags="nn" index="FJ1c_" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu" />
      <concept id="1092119917967" name="jetbrains.mps.baseLanguage.structure.MulExpression" flags="nn" index="17qRlL" />
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_" />
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242869" name="jetbrains.mps.baseLanguage.structure.MinusExpression" flags="nn" index="3cpWsd" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
    </language>
    <language id="47f075a6-558e-4640-a606-7ce0236c8023" name="com.mbeddr.mpsutil.interpreter">
      <concept id="5293529713177831489" name="com.mbeddr.mpsutil.interpreter.structure.NodeExpression" flags="ng" index="oxGPV" />
      <concept id="8615074351687299818" name="com.mbeddr.mpsutil.interpreter.structure.Interpreter" flags="ng" index="qq9qg">
        <property id="8426159527444241399" name="category" index="UYu25" />
        <child id="8615074351687302157" name="evaluators" index="qq9xR" />
      </concept>
      <concept id="8615074351687301435" name="com.mbeddr.mpsutil.interpreter.structure.ConceptEvaluator" flags="ng" index="qq9P1">
        <reference id="8615074351687302216" name="concept" index="qq9wM" />
      </concept>
      <concept id="5712773029518214110" name="com.mbeddr.mpsutil.interpreter.structure.ConceptEvaluatorBody" flags="ng" index="3dA_Gj">
        <child id="5934114435582613364" name="body" index="3vcmbn" />
      </concept>
      <concept id="5934114435583058812" name="com.mbeddr.mpsutil.interpreter.structure.AbstractEvaluator" flags="ng" index="3va1rv">
        <property id="8845772667389641968" name="cacheValues" index="2TnfIJ" />
        <child id="5934114435584084790" name="evaluator" index="3vQZUl" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="qq9qg" id="2cuvxf1NPUm">
    <property role="TrG5h" value="COPLInterpreter" />
    <property role="UYu25" value="copl-interpreter" />
    <node concept="qq9P1" id="2cuvxf1NQ2L" role="qq9xR">
      <property role="2TnfIJ" value="true" />
      <ref role="qq9wM" to="v8ga:2cuvxf1Mjal" resolve="Addition" />
      <node concept="3dA_Gj" id="2cuvxf1NQ2V" role="3vQZUl">
        <node concept="9aQIb" id="2cuvxf1NT_O" role="3vcmbn">
          <node concept="3clFbS" id="2cuvxf1NT_P" role="9aQI4">
            <node concept="3cpWs6" id="2cuvxf1Oahk" role="3cqZAp">
              <node concept="3cpWs3" id="2cuvxf1ObCi" role="3cqZAk">
                <node concept="2OqwBi" id="2cuvxf1ObQy" role="3uHU7w">
                  <node concept="2OqwBi" id="2cuvxf1ObM7" role="2Oq$k0">
                    <node concept="oxGPV" id="2cuvxf1ObCS" role="2Oq$k0" />
                    <node concept="3TrEf2" id="2cuvxf1ObN7" role="2OqNvi">
                      <ref role="3Tt5mk" to="v8ga:2cuvxf1NuEK" resolve="right" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2cuvxf1ObRI" role="2OqNvi">
                    <ref role="3TsBF5" to="v8ga:1Ir6E9cEiwe" resolve="value" />
                  </node>
                </node>
                <node concept="2OqwBi" id="2cuvxf1OaJN" role="3uHU7B">
                  <node concept="2OqwBi" id="2cuvxf1Oapu" role="2Oq$k0">
                    <node concept="oxGPV" id="2cuvxf1Oaho" role="2Oq$k0" />
                    <node concept="3TrEf2" id="2cuvxf1OaBc" role="2OqNvi">
                      <ref role="3Tt5mk" to="v8ga:2cuvxf1NuEI" resolve="left" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2cuvxf1Ob1U" role="2OqNvi">
                    <ref role="3TsBF5" to="v8ga:1Ir6E9cEiwe" resolve="value" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="qq9P1" id="2cuvxf1Od0B" role="qq9xR">
      <property role="2TnfIJ" value="true" />
      <ref role="qq9wM" to="v8ga:2cuvxf1MCoI" resolve="Division" />
      <node concept="3dA_Gj" id="2cuvxf1Od1$" role="3vQZUl">
        <node concept="9aQIb" id="2cuvxf1Od1A" role="3vcmbn">
          <node concept="3clFbS" id="2cuvxf1Od1C" role="9aQI4">
            <node concept="3cpWs6" id="2cuvxf1Od1R" role="3cqZAp">
              <node concept="FJ1c_" id="2cuvxf1Oe$k" role="3cqZAk">
                <node concept="2OqwBi" id="2cuvxf1Ofjb" role="3uHU7w">
                  <node concept="2OqwBi" id="2cuvxf1OePH" role="2Oq$k0">
                    <node concept="oxGPV" id="2cuvxf1Oe$z" role="2Oq$k0" />
                    <node concept="3TrEf2" id="2cuvxf1Of8F" role="2OqNvi">
                      <ref role="3Tt5mk" to="v8ga:2cuvxf1NuEK" resolve="right" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2cuvxf1Ofkt" role="2OqNvi">
                    <ref role="3TsBF5" to="v8ga:1Ir6E9cEiwe" resolve="value" />
                  </node>
                </node>
                <node concept="2OqwBi" id="2cuvxf1Odwr" role="3uHU7B">
                  <node concept="2OqwBi" id="2cuvxf1Oda6" role="2Oq$k0">
                    <node concept="oxGPV" id="2cuvxf1Od20" role="2Oq$k0" />
                    <node concept="3TrEf2" id="2cuvxf1OdnO" role="2OqNvi">
                      <ref role="3Tt5mk" to="v8ga:2cuvxf1NuEI" resolve="left" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2cuvxf1OdN9" role="2OqNvi">
                    <ref role="3TsBF5" to="v8ga:1Ir6E9cEiwe" resolve="value" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="qq9P1" id="2cuvxf1Ofp8" role="qq9xR">
      <property role="2TnfIJ" value="true" />
      <ref role="qq9wM" to="v8ga:2cuvxf1Mjao" resolve="Multiplication" />
      <node concept="3dA_Gj" id="2cuvxf1OfqQ" role="3vQZUl">
        <node concept="9aQIb" id="2cuvxf1OfqS" role="3vcmbn">
          <node concept="3clFbS" id="2cuvxf1OfqU" role="9aQI4">
            <node concept="3cpWs6" id="2cuvxf1Ofr9" role="3cqZAp">
              <node concept="17qRlL" id="2cuvxf1Or6K" role="3cqZAk">
                <node concept="2OqwBi" id="2cuvxf1OrkQ" role="3uHU7w">
                  <node concept="2OqwBi" id="2cuvxf1Org_" role="2Oq$k0">
                    <node concept="oxGPV" id="2cuvxf1Or7m" role="2Oq$k0" />
                    <node concept="3TrEf2" id="2cuvxf1Orhx" role="2OqNvi">
                      <ref role="3Tt5mk" to="v8ga:2cuvxf1NuEK" resolve="right" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2cuvxf1Orm2" role="2OqNvi">
                    <ref role="3TsBF5" to="v8ga:1Ir6E9cEiwe" resolve="value" />
                  </node>
                </node>
                <node concept="2OqwBi" id="2cuvxf1OqgL" role="3uHU7B">
                  <node concept="2OqwBi" id="2cuvxf1OpRv" role="2Oq$k0">
                    <node concept="oxGPV" id="2cuvxf1Ofre" role="2Oq$k0" />
                    <node concept="3TrEf2" id="2cuvxf1Oq5C" role="2OqNvi">
                      <ref role="3Tt5mk" to="v8ga:2cuvxf1NuEI" resolve="left" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2cuvxf1Oqwo" role="2OqNvi">
                    <ref role="3TsBF5" to="v8ga:1Ir6E9cEiwe" resolve="value" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="qq9P1" id="2cuvxf1OrBL" role="qq9xR">
      <property role="2TnfIJ" value="true" />
      <ref role="qq9wM" to="v8ga:2cuvxf1Mjai" resolve="Substraction" />
      <node concept="3dA_Gj" id="2cuvxf1OrEg" role="3vQZUl">
        <node concept="9aQIb" id="2cuvxf1OrEi" role="3vcmbn">
          <node concept="3clFbS" id="2cuvxf1OrEk" role="9aQI4">
            <node concept="3cpWs6" id="2cuvxf1OrEz" role="3cqZAp">
              <node concept="3cpWsd" id="2cuvxf1Ot6c" role="3cqZAk">
                <node concept="2OqwBi" id="2cuvxf1OtKj" role="3uHU7w">
                  <node concept="2OqwBi" id="2cuvxf1OtnT" role="2Oq$k0">
                    <node concept="oxGPV" id="2cuvxf1Ot6M" role="2Oq$k0" />
                    <node concept="3TrEf2" id="2cuvxf1Ot_N" role="2OqNvi">
                      <ref role="3Tt5mk" to="v8ga:2cuvxf1NuEK" resolve="right" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2cuvxf1OtLv" role="2OqNvi">
                    <ref role="3TsBF5" to="v8ga:1Ir6E9cEiwe" resolve="value" />
                  </node>
                </node>
                <node concept="2OqwBi" id="2cuvxf1Os93" role="3uHU7B">
                  <node concept="2OqwBi" id="2cuvxf1OrMI" role="2Oq$k0">
                    <node concept="oxGPV" id="2cuvxf1OrEC" role="2Oq$k0" />
                    <node concept="3TrEf2" id="2cuvxf1Os0s" role="2OqNvi">
                      <ref role="3Tt5mk" to="v8ga:2cuvxf1NuEI" resolve="left" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2cuvxf1OssZ" role="2OqNvi">
                    <ref role="3TsBF5" to="v8ga:1Ir6E9cEiwe" resolve="value" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3JEE7152ea2">
    <property role="TrG5h" value="EvalHelper" />
    <node concept="3clFb_" id="3JEE7152ebf" role="jymVt">
      <property role="TrG5h" value="eval" />
      <node concept="3clFbS" id="3JEE7152ebi" role="3clF47" />
      <node concept="3Tm1VV" id="3JEE7152eaO" role="1B3o_S" />
      <node concept="3uibUv" id="3JEE7152eb3" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
      </node>
      <node concept="37vLTG" id="3JEE7152ebD" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3Tqbb2" id="3JEE7152ecF" role="1tU5fm" />
      </node>
    </node>
    <node concept="3Tm1VV" id="3JEE7152ea3" role="1B3o_S" />
  </node>
</model>

