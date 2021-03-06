package ru.geekbrains.main.site.at.example.junit.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class StringHamcrestTest {
    //    Допустим, есть строка. Надо проверить, что она равна «petya», независимо от регистра (большие или маленькие буквы):
    @Test
    public void given2Strings_whenEqual_thenCorrect() {
        String nameActual = "Petya";
        String nameExpected = "petya";
        assertThat(nameActual, equalToIgnoringCase(nameExpected));
    }

    //    А теперь допустим имеется строка, и надо проверить, что строка равна “Hi Petya”; При этом сравнивать надо без учета лишних пробелов, так что в начале и в конце строки пробелы удаляются, а в середине все подряд идущие пробелы сводятся к одному:
    @Test
    public void given2Strings_whenEqualIgnWS_thenCorrect() {
        String a = "  Hi   Petya ";
        assertThat(a, equalToCompressingWhiteSpace("Hi Petya"));
    }
}
