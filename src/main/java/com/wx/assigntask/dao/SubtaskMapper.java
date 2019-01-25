package com.wx.assigntask.dao;

import com.wx.assigntask.entity.Subtask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface SubtaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtask
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer subtaskid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtask
     *
     * @mbg.generated
     */
    int insert(Subtask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtask
     *
     * @mbg.generated
     */
    Subtask selectByPrimaryKey(Integer subtaskid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtask
     *
     * @mbg.generated
     */
    List<Subtask> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtask
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Subtask record);

    /**
     * 插入subtask
     */
    int inserSubtask(Subtask subtask);
    int inserToLstmNn(Subtask subtask);
    int insertToCnnTfidf(Subtask subtask);
    int insertToDocIndex(Subtask subtask);
    int insertToFinal1(Subtask subtask);
    int insertToFinal2(Subtask subtask);

    List<Subtask> selectAllSubtask();
    List<Subtask> selectAllLstmNn();
    List<Subtask> selectAllCnnTfidf();
    List<Subtask> selectAllDocIndex();
    List<Subtask> selectAllFinal1();
    List<Subtask> selectAllFinal2();

    List<Integer> selectNullScore1();//查询score1为空的subtaskid
    List<Integer> selectNullLstmNnScore1();
    List<Integer> selectNullCnnTfiScore1();
    List<Integer> selectNullDocIndexScore1();
    List<Integer> selectNullFinal1Score1();
    List<Integer> selectNullFinal2Score1();

    List<Integer> selectNullScore2();//查询score2为空的subtaskid
    List<Integer> selectNullLstmNnScore2();
    List<Integer> selectNullCnnTfiScore2();
    List<Integer> selectNullDocIndexScore2();
    List<Integer> selectNullFinal1Score2();
    List<Integer> selectNullFinal2Score2();


    Subtask selectSubtaskBySubid(int subtaskid);
    Subtask selectLstmNnBySubid(int subtaskid);
    Subtask selectCnnTfidfBySubid(int subtaskid);
    Subtask selectDocIndexBySubid(int subtaskid);
    Subtask selectFinal1BySubid(int subtaskid);
    Subtask selectFinal2BySubid(int subtaskid);

    int selectSumScore1(int dividedid);
    int selectSumScore2(int dividedid);
    int selectLstmNnSumScore1(int dividedid);
    int selectCnnTfidfSumScore1(int dividedid);
    int selectDocIndexSumScore1(int dividedid);
    int selectFinal1SumScore1(int dividedid);
    int selectFinal2SumScore1(int dividedid);

    int selectLstmNnSumScore2(int dividedid);
    int selectCnnTfidfSumScore2(int dividedid);
    int selectDocIndexSumScore2(int dividedid);
    int selectFinal1SumScore2(int dividedid);
    int selectFinal2SumScore2(int dividedid);

    int selectItem1SumScore(Subtask subtask);//查询A1出现在itemName1时的平均score
    int selectItem2SumScore(Subtask subtask);//查询A1出现在itemName2时的平均score

    int updateSubtaskRandom(Subtask subtask);
    int updateLstmNnRandom(Subtask subtask);
    int updateCnnTfidfRandom(Subtask subtask);
    int updateDocIndexRandom(Subtask subtask);
    int updateFinal1Random(Subtask subtask);
    int updateFinal2Random(Subtask subtask);

    int updateFre(Subtask subtask);
    int updateFreLstmNn(Subtask subtask);
    int updateFreCnnTfidf(Subtask subtask);
    int updateFreDocIndex(Subtask subtask);
    int updateFreFinal1(Subtask subtask);
    int updateFreFinal2(Subtask subtask);

    int updateScore1(Subtask subtask);
    int updateLstmNnScore1(Subtask subtask);
    int updateCnnTfiScore1(Subtask subtask);
    int updateDocIndexScore1(Subtask subtask);
    int updateFinal1Score1(Subtask subtask);
    int updateFinal2Score1(Subtask subtask);

    int updateScore2(Subtask subtask);
    int updateLstmNnScore2(Subtask subtask);
    int updateCnnTfiScore2(Subtask subtask);
    int updateDocIndexScore2(Subtask subtask);
    int updateFinal1Score2(Subtask subtask);
    int updateFinal2Score2(Subtask subtask);



}