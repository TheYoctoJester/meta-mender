require mender-connect.inc

################################################################################
#-------------------------------------------------------------------------------
# THINGS TO CONSIDER FOR EACH RELEASE:
# - SRC_URI (particularly "branch")
# - SRCREV
# - DEFAULT_PREFERENCE
#-------------------------------------------------------------------------------

SRC_URI = "git://github.com/mendersoftware/mender-connect.git;protocol=https;branch=2.3.x"

# Tag: 2.3.1
SRCREV = "f44d7a12ee19706e28831983f10439259cc8d174"

# Enable this in Betas, and in branches that cannot carry this major version as
# default.
# Downprioritize this recipe in version selections.
# DEFAULT_PREFERENCE = "-1"

################################################################################

# DO NOT change the checksum here without make sure that ALL licenses (including
# dependencies) are included in the LICENSE variable below. Note that for
# releases, we must check the LIC_FILES_CHKSUM.sha256 file, not the LICENSE
# file.
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & ISC & MIT"
LIC_FILES_CHKSUM = " \
    file://src/github.com/mendersoftware/mender-connect/LICENSE;md5=f92624f2343d21e1986ca36f82756029 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/mendersoftware/go-lib-micro/LICENSE;md5=e33ec9ac79630c915f82b11a3d4545e9 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/pkg/errors/LICENSE;md5=6fe682a02df52c6653f33bd0f7126b5a \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/vmihailenco/msgpack/v5/LICENSE;md5=5de50b60705d666cd9542dd48d5e4b56 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/vmihailenco/tagparser/v2/LICENSE;md5=e9f573ea1e3d968278166de82cd36301 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/pmezard/go-difflib/LICENSE;md5=e9a2ebb8de779a07500ddecca806145e \
    file://src/github.com/mendersoftware/mender-connect/vendor/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/github.com/mendersoftware/mender-connect/vendor/golang.org/x/net/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/gorilla/websocket/LICENSE;md5=c30eee78985cf2584cded5f89ba3d787 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/davecgh/go-spew/LICENSE;md5=c06795ed54b2a35ebeeb543cd3a73e56 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/go-ozzo/ozzo-validation/v4/LICENSE;md5=da12d993f2ce14947ad6eec35520b081 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/satori/go.uuid/LICENSE;md5=ae4ba217c6e20c2d8f48f69966b9121b \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/sirupsen/logrus/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/stretchr/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/stretchr/testify/LICENSE;md5=188f01994659f3c0d310612333d2a26f \
    file://src/github.com/mendersoftware/mender-connect/vendor/github.com/urfave/cli/v2/LICENSE;md5=c542707ca9fc0b7802407ba62310bd8f \
    file://src/github.com/mendersoftware/mender-connect/vendor/gopkg.in/yaml.v3/LICENSE;md5=3c91c17266710e16afdbb2b6d15c761c \
"
