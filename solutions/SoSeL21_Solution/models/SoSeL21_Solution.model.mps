<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:94bd7852-cbd5-4e48-affe-58ea37457392(SoSeL21_Solution.model)">
  <persistence version="9" />
  <languages>
    <use id="7e642a5f-6d9b-49f5-8159-56089ac1a1e9" name="SoSeL21" version="-1" />
  </languages>
  <imports />
  <registry>
    <language id="7e642a5f-6d9b-49f5-8159-56089ac1a1e9" name="SoSeL21">
      <concept id="4161103506187349067" name="SoSeL21.structure.Boolean" flags="ng" index="2ukHBs" />
      <concept id="4161103506187198325" name="SoSeL21.structure.SoSeWorksheet" flags="ng" index="2ulaFy">
        <child id="4161103506187356639" name="contents" index="2ukjL8" />
      </concept>
      <concept id="1989212944787468230" name="SoSeL21.structure.Reference" flags="ng" index="1ncnl$">
        <reference id="6844863898947578813" name="definition" index="elVNe" />
      </concept>
      <concept id="1989212944787384331" name="SoSeL21.structure.Integer" flags="ng" index="1nczaD">
        <property id="1989212944787384334" name="value" index="1nczaG" />
      </concept>
      <concept id="2530598663949464213" name="SoSeL21.structure.Addition" flags="ng" index="3yPOM6" />
      <concept id="2530598663949464207" name="SoSeL21.structure.IExpression" flags="ng" index="3yPOMs">
        <reference id="2530598663949773488" name="right" index="3yOTiz" />
        <reference id="2530598663949773486" name="left" index="3yOTiX" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2ulaFy" id="1Ir6E9cEiw8">
    <property role="TrG5h" value="moin" />
    <node concept="2ukHBs" id="5VXPRdgF8mt" role="2ukjL8">
      <property role="TrG5h" value="test" />
    </node>
    <node concept="2ukHBs" id="5VXPRdgF8my" role="2ukjL8">
      <property role="TrG5h" value="test2" />
    </node>
    <node concept="1ncnl$" id="5VXPRdgF8mO" role="2ukjL8">
      <ref role="elVNe" node="5VXPRdgF8mt" resolve="test" />
    </node>
    <node concept="1ncnl$" id="5VXPRdgFfCg" role="2ukjL8">
      <ref role="elVNe" node="5VXPRdgFfCs" resolve="moin" />
    </node>
    <node concept="2ukHBs" id="5VXPRdgFfCs" role="2ukjL8">
      <property role="TrG5h" value="moin" />
    </node>
    <node concept="1nczaD" id="2cuvxf1MoJQ" role="2ukjL8">
      <property role="TrG5h" value="tester" />
      <property role="1nczaG" value="5" />
    </node>
    <node concept="1nczaD" id="2cuvxf1MCol" role="2ukjL8">
      <property role="TrG5h" value="num" />
      <property role="1nczaG" value="8" />
    </node>
    <node concept="3yPOM6" id="2cuvxf1Not0" role="2ukjL8">
      <ref role="3yOTiX" node="2cuvxf1MCol" resolve="num" />
      <ref role="3yOTiz" node="2cuvxf1MCol" resolve="num" />
    </node>
  </node>
  <node concept="2ulaFy" id="5VXPRdgFfBp">
    <property role="TrG5h" value="ws2" />
    <node concept="2ukHBs" id="5VXPRdgFfBz" role="2ukjL8">
      <property role="TrG5h" value="test" />
    </node>
    <node concept="1ncnl$" id="5VXPRdgFfBC" role="2ukjL8">
      <ref role="elVNe" node="5VXPRdgFfBz" resolve="test" />
    </node>
    <node concept="1nczaD" id="5VXPRdgFfBK" role="2ukjL8">
      <property role="TrG5h" value="integer" />
    </node>
  </node>
</model>
