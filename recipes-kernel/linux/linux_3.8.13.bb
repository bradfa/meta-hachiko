DESCRIPTION = "Mainline Linux Kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

inherit kernel
require recipes-kernel/linux/linux-dtb.inc

LINUX_VERSION = "3.8.13"
PR = "r2"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI =  "${KERNELORG_MIRROR}/linux/kernel/v3.0/linux-${PV}.tar.bz2;name=kernel"
SRC_URI += "file://0001-Imported-Renesas-patch-v2.0.0.patch"
SRC_URI += "file://0002-Add-hachiko-support.patch"
SRC_URI += "file://defconfig"

SRC_URI[kernel.md5sum] = "db03acc21c41fc6bea8ddf7a77fc83aa"
SRC_URI[kernel.sha256sum] = "7107a2ea655bde36bc470ac87707771801076e99919a6497f1eec494c70b0f99"

COMPATIBLE_MACHINE_hachiko64 = "hachiko64"
