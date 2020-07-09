#! /bin/bash
# exit script when any command ran here returns with non-zero exit code
set -e

GITHUB_SHA=$1
DEPLOYMENT=$2

# We must export it so it's available for envsubst
export GITHUB_SHA=$1

# since the only way for envsubst to work on files is using input/output redirection,
#  it's not possible to do in-place substitution, so we need to save the output to another file
#  and overwrite the original with that one.
envsubst <./k8s/deployments/$2.yaml >./k8s/deployments/$2.yaml.out
mv ./k8s/deployments/$2.yaml.out ./k8s/deployments/$2.yaml

kubectl apply -f ./k8s/deployments/$2.yaml

