org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/hello'
        body("""{
        
        }""")
        hearders {
            hearder('Content-Type', 'application/json')
        }
    }
    response {
        status 200
        body("""{
        
        }""")
        hearders {
            hearder('Content-Type', 'application/json')
        }
    }
}
