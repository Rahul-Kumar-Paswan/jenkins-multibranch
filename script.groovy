def buildApp(){
    echo "This is Build stage"
}

def testApp(){
    echo "This is test stage"
}

def deployApp(){
    echo "This is deploy stage"
    echo "version ${VERSION}"
}

def prodApp(){
    echo "This is Production stage"
}

return this