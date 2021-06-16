<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:03768692-7970-42cd-b446-2b0e8b37fedb(SoSeL21.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169125989551" name="jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration" flags="ig" index="PlHQZ">
        <child id="1169127546356" name="extends" index="PrDN$" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
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
  <node concept="1TIwiD" id="3AZdpuBUTXP">
    <property role="EcuMT" value="4161103506187198325" />
    <property role="TrG5h" value="SoSeWorksheet" />
    <property role="34LRSv" value="SoSeWorksheet" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3AZdpuBUTXQ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="3AZdpuBVwBv" role="1TKVEi">
      <property role="IQ2ns" value="4161103506187356639" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="contents" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2cuvxf1MdD0" resolve="IContent" />
    </node>
  </node>
  <node concept="PlHQZ" id="3AZdpuBVuFb">
    <property role="EcuMT" value="4161103506187348683" />
    <property role="TrG5h" value="IDeclaration" />
    <node concept="PrWs8" id="2cuvxf1MdD3" role="PrDN$">
      <ref role="PrY4T" node="2cuvxf1MdD0" resolve="IContent" />
    </node>
  </node>
  <node concept="1TIwiD" id="3AZdpuBVuLb">
    <property role="EcuMT" value="4161103506187349067" />
    <property role="TrG5h" value="Boolean" />
    <property role="34LRSv" value="boolean" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3AZdpuBVuLc" role="PzmwI">
      <ref role="PrY4T" node="3AZdpuBVuFb" resolve="IDeclaration" />
    </node>
    <node concept="1TJgyi" id="3AZdpuBVuLe" role="1TKVEl">
      <property role="IQ2nx" value="4161103506187349070" />
      <property role="TrG5h" value="value" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="1TIwiD" id="1Ir6E9cEiwb">
    <property role="EcuMT" value="1989212944787384331" />
    <property role="TrG5h" value="Integer" />
    <property role="34LRSv" value="int" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="1Ir6E9cEiwe" role="1TKVEl">
      <property role="IQ2nx" value="1989212944787384334" />
      <property role="TrG5h" value="value" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="PrWs8" id="qPnaaOdZTr" role="PzmwI">
      <ref role="PrY4T" node="3AZdpuBVuFb" resolve="IDeclaration" />
    </node>
  </node>
  <node concept="1TIwiD" id="1Ir6E9cEAZ6">
    <property role="EcuMT" value="1989212944787468230" />
    <property role="TrG5h" value="Reference" />
    <property role="34LRSv" value="ref" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5VXPRdgEAIX" role="1TKVEi">
      <property role="IQ2ns" value="6844863898947578813" />
      <property role="20kJfa" value="definition" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3AZdpuBVuFb" resolve="IDeclaration" />
    </node>
    <node concept="PrWs8" id="5VXPRdgF7v2" role="PzmwI">
      <ref role="PrY4T" node="3AZdpuBVuFb" resolve="IDeclaration" />
    </node>
  </node>
  <node concept="PlHQZ" id="2cuvxf1MdD0">
    <property role="EcuMT" value="2530598663949441600" />
    <property role="TrG5h" value="IContent" />
    <node concept="PrWs8" id="2cuvxf1MdD1" role="PrDN$">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="PlHQZ" id="2cuvxf1Mjaf">
    <property role="EcuMT" value="2530598663949464207" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="IExpression" />
    <node concept="PrWs8" id="2cuvxf1N1Xs" role="PrDN$">
      <ref role="PrY4T" node="2cuvxf1MdD0" resolve="IContent" />
    </node>
    <node concept="1TJgyj" id="qPnaaOdkOo" role="1TKVEi">
      <property role="IQ2ns" value="483394388890045720" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="left" />
      <ref role="20lvS9" node="2cuvxf1Mjaf" resolve="IExpression" />
    </node>
    <node concept="1TJgyj" id="qPnaaOdkOq" role="1TKVEi">
      <property role="IQ2ns" value="483394388890045722" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="right" />
      <ref role="20lvS9" node="2cuvxf1Mjaf" resolve="IExpression" />
    </node>
  </node>
  <node concept="1TIwiD" id="2cuvxf1Mjai">
    <property role="EcuMT" value="2530598663949464210" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="Substraction" />
    <property role="34LRSv" value="-" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2cuvxf1Mjaj" role="PzmwI">
      <ref role="PrY4T" node="2cuvxf1Mjaf" resolve="IExpression" />
    </node>
  </node>
  <node concept="1TIwiD" id="2cuvxf1Mjal">
    <property role="EcuMT" value="2530598663949464213" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="Addition" />
    <property role="34LRSv" value="+" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2cuvxf1Mjam" role="PzmwI">
      <ref role="PrY4T" node="2cuvxf1Mjaf" resolve="IExpression" />
    </node>
  </node>
  <node concept="1TIwiD" id="2cuvxf1Mjao">
    <property role="EcuMT" value="2530598663949464216" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="Multiplication" />
    <property role="34LRSv" value="*" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2cuvxf1OfF5" role="PzmwI">
      <ref role="PrY4T" node="2cuvxf1Mjaf" resolve="IExpression" />
    </node>
  </node>
  <node concept="1TIwiD" id="2cuvxf1Mjar">
    <property role="EcuMT" value="2530598663949464219" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="Assignment" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2cuvxf1Mjau" role="PzmwI">
      <ref role="PrY4T" node="2cuvxf1Mjaf" resolve="IExpression" />
    </node>
  </node>
  <node concept="1TIwiD" id="2cuvxf1MCoI">
    <property role="EcuMT" value="2530598663949551150" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="Division" />
    <property role="34LRSv" value="/" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2cuvxf1MCoJ" role="PzmwI">
      <ref role="PrY4T" node="2cuvxf1Mjaf" resolve="IExpression" />
    </node>
  </node>
  <node concept="1TIwiD" id="11M_ydYayGL">
    <property role="EcuMT" value="1185174731136576305" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="IntVal" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="qPnaaOdMdc" role="PzmwI">
      <ref role="PrY4T" node="qPnaaOdMd9" resolve="Int" />
    </node>
    <node concept="1TJgyi" id="11M_ydYayGO" role="1TKVEl">
      <property role="IQ2nx" value="1185174731136576308" />
      <property role="TrG5h" value="value" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
  </node>
  <node concept="1TIwiD" id="11M_ydYayGQ">
    <property role="EcuMT" value="1185174731136576310" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="IntRef" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="qPnaaOdMda" role="PzmwI">
      <ref role="PrY4T" node="qPnaaOdMd9" resolve="Int" />
    </node>
    <node concept="1TJgyj" id="qPnaaOeext" role="1TKVEi">
      <property role="IQ2ns" value="483394388890282077" />
      <property role="20kJfa" value="value" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="1Ir6E9cEiwb" resolve="Integer" />
    </node>
  </node>
  <node concept="PlHQZ" id="qPnaaOdMd9">
    <property role="EcuMT" value="483394388890166089" />
    <property role="3GE5qa" value="expressions" />
    <property role="TrG5h" value="Int" />
    <node concept="PrWs8" id="qPnaaOePL9" role="PrDN$">
      <ref role="PrY4T" node="2cuvxf1Mjaf" resolve="IExpression" />
    </node>
  </node>
</model>

