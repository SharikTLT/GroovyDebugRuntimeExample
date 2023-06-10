import org.junit.Test

import static org.junit.Assert.assertEquals

class FirstBlock extends BaseTest{

    def somFunc(var Object input){
        def filtered = input.someList.findAll {
            it.status != "b"
        }
        return filtered
    }

    @Test
    void first(){
        def input = parse("Basic_001")

        def result = somFunc(input)

        assertEquals(1, result[0].id)
    }
}
