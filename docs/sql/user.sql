/*
 Navicat Premium Data Transfer

 Source Server         : Ys
 Source Server Type    : MySQL
 Source Server Version : 80046
 Source Host           : localhost:3307
 Source Schema         : aitutor

 Target Server Type    : MySQL
 Target Server Version : 80046
 File Encoding         : 65001

 Date: 14/09/2026 16:26:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `role` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT 'user' COMMENT '角色',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '$2a$10$r1X0ruO6cAy93Hx4HPiebuKQXy4DCJSHa2dLvfLWOl4lVAVdBjvE2', 'admin', '2026-09-12 19:09:01');
INSERT INTO `user` VALUES (2, 'student', '$2a$10$Mltnbdk89gI1gkwjyAh51uDhtGgkaRc0Qf4eKFLyJpnSXPXzS3An2', 'student', '2026-09-12 19:09:01');

SET FOREIGN_KEY_CHECKS = 1;
