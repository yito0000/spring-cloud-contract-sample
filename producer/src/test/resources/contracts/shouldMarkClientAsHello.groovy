org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/hello'
        body("""{
        
        }""")
        headers {

        }
    }
    response {
        status 200
        body("""{"id":"id","value":"value"}""")
        headers {
            header('Content-Type', 'text/plain;charset=ISO-8859-1')
        }
    }
}

