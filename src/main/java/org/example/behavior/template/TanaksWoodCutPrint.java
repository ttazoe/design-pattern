package org.example.behavior.template;

public class TanaksWoodCutPrint extends WoodCutPrint {
    @Override
    public void draw(Cuttable hanzai) {
        System.out.println("hanzai にマジックを使って大好きな女の子の絵を描く");
    }

    @Override
    public void cut(Cuttable hanzai) {
        System.out.println("彫刻刀を使って細部まで丁寧に hanzai を彫る");
    }

    @Override
    public void print(Cuttable hanzai) {
        System.out.println("版画インクと馬簾を使って豪快にプリントする");
    }
}
