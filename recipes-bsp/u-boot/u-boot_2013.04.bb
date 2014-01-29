require recipes-bsp/u-boot/u-boot.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

SRC_URI = "ftp://ftp.denx.de/pub/u-boot/${PN}-${PV}.tar.bz2"
SRC_URI += "file://0001-Add-bps-patch-v2.0.0.patch"
SRC_URI += "file://0002-Add-hachiko-support.patch"

SRC_URI[md5sum] = "21bf962d69938ed4ed783b792b2b074e"
SRC_URI[sha256sum] = "4150e5a4480707c55a8d5b4570262e43af68d8ed3bdc0a433d8e7df47989a69e"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "hachiko64|hachiko"
