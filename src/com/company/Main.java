package com.company;

public class Main {

    public static void main(String[] args) {
        String code1 = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";

        String code = code1.toLowerCase();
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String symbol = "!@#$%^&*()_+<>?,./ ";
        // int shift = 22; // корректный вариант расшифровки текста происходит при сдвиге 22
        for (int shift = 0; shift < 33; shift++) {
            System.out.println(shift + " ");

            char[] chArrayCode = code.toCharArray();
            char[] chArrayAlphabet = alphabet.toCharArray();
            char[] chArraysymbol = symbol.toCharArray();
            char[] temp = new char[chArrayCode.length];

            for(int i = 0; i< chArrayCode.length; i++) {
                for (int j = 0; j < chArrayAlphabet.length; j++) {
                    for (int p = 0; p < chArraysymbol.length; p++) {

                        if (chArrayCode[i] == chArrayAlphabet[j]) {
                            int k = j-shift;
                            if (k < 0){
                                temp[i] = chArrayAlphabet[chArrayAlphabet.length + k];
                            } else {
                                temp[i] = chArrayAlphabet[j-shift];
                            }
                        } else if (chArrayCode[i] == chArraysymbol[p]) {
                            temp[i] = chArraysymbol[p];
                        }
                    }
                }
            }
        System.out.println(temp);
    }
    }
}

