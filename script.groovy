
def buildApp(){
    echo "This is Build stage"
    echo "This is edited Build stage"
    echo "This is again edited Build stage"
}

def testApp(){
    echo "This is test stage"
}

def deployApp(){
    echo "This is deploy stage"
    echo "version ${env.VERSION}"
}

def prodApp(){
    echo "This is Production stage"
}

return this
