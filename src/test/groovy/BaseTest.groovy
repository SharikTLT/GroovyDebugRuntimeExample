import groovy.json.JsonSlurper

class BaseTest {

    def jsonSlurper = new JsonSlurper()

    /**
     * Парсим json по пути
     *  src/test/resources/{ИМЯ_КЛАССА}Input/{PATH}.json
     * @param path
     * @return obj
     */
    Object parse(String path) {
        def className = this.class.name
        return jsonSlurper.parse(new File("src/test/resources/${className}Input/${path}.json"))
    }
}
